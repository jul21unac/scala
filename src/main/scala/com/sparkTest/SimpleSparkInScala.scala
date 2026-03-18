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
    val spark = SparkSession.builder()
      .appName("HiveTableExample")
      .config("hive.metastore.uris", "thrift://localhost:9083")  // O host.docker.internal si Spark en Docker
      .config("spark.sql.warehouse.dir", "/user/hive/warehouse")
      .enableHiveSupport()
      .getOrCreate()

    spark.sql("""
  CREATE TABLE IF NOT EXISTS mi_tabla (
    id INT,
    nombre STRING
  ) USING hive
""")

  }

}
