package com.kuduTest
import org.apache.kudu.spark.kudu._
import org.apache.spark.sql.SparkSession
import org.apache.kudu.client.CreateTableOptions
import org.apache.spark.sql.types._
import java.net.InetAddress
import java.util

object RunKuduTest {



val KUDU_MASTERS = "127.0.0.1:7051,127.0.0.1:7052,127.0.0.1:7053"

def main(args: Array[String]): Unit = {



    val spark = SparkSession.builder()
      .appName("CreateKuduTable")
       .master("local[*]")
      .config("spark.driver.host", "127.0.0.1")
      .config("hive.metastore.uris", "thrift://127.0.0.1:9083")
      .config("spark.kudu.operation.timeout.ms", "60000")
      .config("spark.kudu.admin.operation.timeout.ms", "60000")
      .enableHiveSupport()  // sin .config("spark.sql.warehouse.dir", ...)
      .getOrCreate()
     /* .appName("CreateKuduTable")
      .master("local[*]")
      .getOrCreate()*/

    // 1. Crear el KuduContext apuntando a tus masters
    val kuduContext = new KuduContext(KUDU_MASTERS, spark.sparkContext)

    val tableName = "staging.test_tabla"

    // 2. Definir el schema
    val schema = StructType(Seq(
      StructField("id",     IntegerType, nullable = false),
      StructField("nombre", StringType,  nullable = true),
      StructField("valor",  DoubleType,  nullable = true)
    ))

    // 3. Definir la clave primaria y opciones de la tabla
    val primaryKey = List("id")

    val tableOptions = new CreateTableOptions()
      .setNumReplicas(1)                          // 1 replica porque solo tienes 1 tserver
      .addHashPartitions(util.Arrays.asList("id"), 2)  // Mínimo 2 buckets requerido por Kudu

    // 4. Crear la tabla si no existe
    if (!kuduContext.tableExists(tableName)) {
      kuduContext.createTable(tableName, schema, primaryKey, tableOptions)
      println(s"✅ Tabla '$tableName' creada correctamente")
    } else {
      println(s"⚠️  La tabla '$tableName' ya existe")
    }

    // 5. Insertar datos de prueba
    import spark.implicits._
    val datos = Seq(
      (1, "Alice", 100.0),
      (2, "Bob",   200.0),
      (3, "Carlos", 300.0)
    ).toDF("id", "nombre", "valor")

 /*   kuduContext.insertRows(datos, tableName)
    println("✅ Datos insertados")
*/
    datos.write.format("org.apache.kudu.spark.kudu")
    .option("kudu.master", KUDU_MASTERS)
    .option("kudu.table", tableName)  
    .mode("append")  // Puedes usar "append" para añadir sin borrar los existentes
    .save()

     println("✅ Datos insertados usando DataFrame API")
    // 6. Leer la tabla de vuelta
   val df_read = spark.read
      .options(Map("kudu.master" -> KUDU_MASTERS, "kudu.table" -> tableName))
      .format("org.apache.kudu.spark.kudu")
      .load()
      
      df_read.show()  // Muestra los datos leídos de Kudu

    spark.stop()
  }
    
}


