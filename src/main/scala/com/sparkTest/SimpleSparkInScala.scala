package com.sparkTest

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object SimpleSparkInScala {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setAppName("Simple does nothing")
      .setMaster("local")
      .set("spark.driver.memory", "1g")

    val sc = new SparkContext(conf)

    val list = List(1, 2)
    val simpleRDD = sc.parallelize(list)
    simpleRDD.foreach { x => println(x) }

    testImpala()
  }

  def testImpala(): Unit = {
    val spark = SparkSession.builder()
      .appName("ImpalaExample")
      .master("local")
      .getOrCreate()

    val impalaUrl = "jdbc:hive2://localhost:21050/default;auth=noSasl"
    val driver = "org.apache.hive.jdbc.HiveDriver"

    // 1. Crear la tabla en Impala (ejecutar SQL directo vía JDBC)
    val conn = java.sql.DriverManager.getConnection(impalaUrl)
    val stmt = conn.createStatement()
    stmt.execute("""
      CREATE TABLE IF NOT EXISTS mi_tabla_7 (
        id INT,
        nombre STRING
      )
      STORED AS PARQUET
    """)
    stmt.execute("INSERT INTO mi_tabla_7 VALUES (2, 'lalal')")
    conn.close()

    // 2. Leer la tabla desde Spark
    val resultado = spark.read
      .format("jdbc")
      .option("url", impalaUrl)
      .option("dbtable", "mi_tabla_7")
      .option("driver", driver)
      .load()

    resultado.show()

    // 3. Escribir un DataFrame nuevo en Impala
    val nuevosDatos = Seq((3, "nuevo"), (4, "dato"))
    val df = spark.createDataFrame(nuevosDatos).toDF("id", "nombre")

    df.write
      .format("jdbc")
      .option("url", impalaUrl)
      .option("dbtable", "mi_tabla_7")
      .option("driver", driver)
      .mode("append")
      .save()

    spark.stop()
  }
}