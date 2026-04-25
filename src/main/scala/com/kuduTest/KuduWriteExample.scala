package com.kuduTest

import org.apache.kudu.spark.kudu._
import org.apache.spark.sql.SparkSession
import org.apache.kudu.client.CreateTableOptions
import org.apache.spark.sql.types._
import java.util

object KuduWriteExample {

  val KUDU_MASTERS = "127.0.0.1:7051,127.0.0.1:7052,127.0.0.1:7053"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("KuduWriteExample")
      .master("local[*]")
      .config("spark.driver.host", "127.0.0.1")
      .config("spark.kudu.operation.timeout.ms", "120000")
      .config("spark.kudu.admin.operation.timeout.ms", "120000")
      .getOrCreate()

    try {
      val kuduContext = new KuduContext(KUDU_MASTERS, spark.sparkContext)
      val tableName = "mi_tabla_kudu"

      // 1. Definir schema
      val schema = StructType(Seq(
        StructField("id", IntegerType, nullable = false),
        StructField("nombre", StringType, nullable = true),
        StructField("email", StringType, nullable = true),
        StructField("edad", IntegerType, nullable = true)
      ))

      // 2. Crear tabla si no existe
      if (!kuduContext.tableExists(tableName)) {
        val primaryKey = List("id")
        val tableOptions = new CreateTableOptions()
          .setNumReplicas(1)
          .addHashPartitions(util.Arrays.asList("id"), 2)
        
        kuduContext.createTable(tableName, schema, primaryKey, tableOptions)
        println(s"✅ Tabla '$tableName' creada")
      } else {
        println(s"ℹ️  Tabla '$tableName' ya existe")
      }

      // 3. Crear DataFrame con datos
      import spark.implicits._
      val datos = Seq(
        (1, "Juan", "juan@example.com", 25),
        (2, "María", "maria@example.com", 30),
        (3, "Carlos", "carlos@example.com", 35),
        (4, "Laura", "laura@example.com", 28)
      ).toDF("id", "nombre", "email", "edad")

      // 4. OPCIÓN A: INSERT (añadir nuevos registros)
      println("\n📝 Insertando datos...")
      kuduContext.insertRows(datos, tableName)
      println("✅ Datos insertados correctamente")

      // 5. OPCIÓN B: UPDATE (actualizar registros existentes)
      println("\n🔄 Actualizando datos...")
      val datosActualizados = Seq(
        (1, "Juan Updated", "juan.new@example.com", 26)
      ).toDF("id", "nombre", "email", "edad")
      kuduContext.updateRows(datosActualizados, tableName)
      println("✅ Datos actualizados")

      // 6. OPCIÓN C: UPSERT (insert si no existe, update si existe)
      println("\n🔀 Ejecutando UPSERT...")
      val datosUpsert = Seq(
        (1, "Juan Upsert", "juan.upsert@example.com", 27),
        (5, "Pedro", "pedro@example.com", 32)
      ).toDF("id", "nombre", "email", "edad")
      kuduContext.upsertRows(datosUpsert, tableName)
      println("✅ UPSERT completado")

      // 7. Leer y mostrar los datos
      println("\n📖 Datos en la tabla:")
      spark.read
        .option("kudu.master", KUDU_MASTERS)
        .option("kudu.table", tableName)
        .format("kudu")
        .load()
        .show(false)

      println("\n✨ Ejemplo completado exitosamente")

    } catch {
      case e: Exception =>
        println(s"❌ Error: ${e.getMessage}")
        e.printStackTrace()
    } finally {
      spark.stop()
    }
  }
}