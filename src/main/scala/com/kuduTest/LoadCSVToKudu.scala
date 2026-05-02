package com.kuduTest

import org.apache.kudu.spark.kudu._
import org.apache.spark.sql.SparkSession
import java.io.File

object LoadCSVToKudu {

  val KUDU_MASTERS = "127.0.0.1:7051,127.0.0.1:7052,127.0.0.1:7053"
  val CSV_DATA_PATH = "src/data"
  val KUDU_SCHEMA = "staging"

  // Mapeo de archivos CSV con sus claves primarias
  val csvFiles = Map(
    "olist_customers_dataset.csv" -> List("customer_id"),
    "olist_geolocation_dataset.csv" -> List("geolocation_zip_code_prefix"),
    "olist_order_items_dataset.csv" -> List("order_id", "order_item_id"),
    "olist_order_payments_dataset.csv" -> List("order_id", "payment_sequential"),
    "olist_order_reviews_dataset.csv" -> List("review_id"),
    "olist_orders_dataset.csv" -> List("order_id"),
    "olist_products_dataset.csv" -> List("product_id"),
    "olist_sellers_dataset.csv" -> List("seller_id"),
    "product_category_name_translation.csv" -> List("product_category_name")
  )

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("LoadCSVToKudu")
      .master("local[*]")
      .config("spark.driver.host", "127.0.0.1")
      .config("hive.metastore.uris", "thrift://127.0.0.1:9083")
      .config("spark.kudu.operation.timeout.ms", "60000")
      .config("spark.kudu.admin.operation.timeout.ms", "60000")
      .enableHiveSupport()
      .getOrCreate()

    val kuduContext = new KuduContext(KUDU_MASTERS, spark.sparkContext)
    val tableCreator = new createTableKudu(kuduContext)

    println("=" * 60)
    println("🚀 Iniciando carga de CSVs a Kudu")
    println("=" * 60)

    for ((csvFileName, primaryKeys) <- csvFiles) {
      try {
        val csvPath = s"$CSV_DATA_PATH/$csvFileName"
        val tableName = s"$KUDU_SCHEMA.${csvFileName.replace(".csv", "")}"

        // Verificar si el archivo existe
        if (!new File(csvPath).exists()) {
          println(s"\n❌ Archivo no encontrado: $csvPath")
          println(s"   Saltando...")
          return
        }

        println(s"\n📄 Procesando: $csvFileName")
        println(s"   Tabla: $tableName")
        println(s"   Clave primaria: ${primaryKeys.mkString(", ")}")

        // Cargar CSV e inferir esquema
        val df = spark.read
          .option("header", "true")
          .option("inferSchema", "true")
          .csv(csvPath)

        println(s"   Filas: ${df.count()}")
        println(s"   Columnas: ${df.columns.mkString(", ")}")

        // Crear tabla Kudu usando la clase createTableKudu
        tableCreator.createTable(
          tableName = tableName,
          dataFrame = df,
          primaryKeys = primaryKeys,
          numReplicas = 1
        )

        // Insertar datos
        df.write
          .format("org.apache.kudu.spark.kudu")
          .option("kudu.master", KUDU_MASTERS)
          .option("kudu.table", tableName)
          .mode("append")
          .save()

        println(s"   ✅ Insertados ${df.count()} registros en '$tableName'")

      } catch {
        case e: Exception =>
          println(s"   ❌ Error procesando $csvFileName: ${e.getMessage}")
          e.printStackTrace()
      }
    }

    println("\n" + "=" * 60)
    println("✅ Proceso completado")
    println("=" * 60)

    spark.stop()
  }
}
