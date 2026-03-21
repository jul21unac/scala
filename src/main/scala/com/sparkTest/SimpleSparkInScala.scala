package com.sparkTest
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object SimpleSparkInScala {

  def main(args: Array[String]) : Unit = {
    val conf = new SparkConf()
      .setAppName("Simple does nothing")
      .setMaster("local").set("spark.driver.memory", "1g")



    val sc = new SparkContext(conf)

    val list = List(1,2)

    val simpleRDD = sc.parallelize(list)

    simpleRDD.foreach { x => println(x) }

    testHive()
  }

  def testHive(): Unit = {
/*    val spark = SparkSession.builder()
      .appName("HiveTableExample")
      .config("hive.metastore.uris", "thrift://localhost:9083")  // O host.docker.internal si Spark en Docker
      .config("spark.sql.warehouse.dir", "/opt/hive/data/warehouse")
      .enableHiveSupport()
      .getOrCreate()
*/
val spark = SparkSession.builder()
  .appName("HiveTableExample")
  .config("hive.metastore.uris", "thrift://localhost:9083")
  .enableHiveSupport()  // sin .config("spark.sql.warehouse.dir", ...)
  .getOrCreate()
 
    spark.sql("""
  CREATE TABLE IF NOT EXISTS mi_tabla_5 (
    id INT,
    nombre STRING
  ) USING hive
""")

    spark.sql("""
  insert into mi_tabla_5 values (2, 'lalal')
""")

val resultado = spark.sql("SELECT * FROM mi_tabla_5")
resultado.show()  // Muestra todas las filas (20 por defecto)

spark.stop()

  }

}
