package com.sparkTest
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object SimpleSparkInScala {

  def main(args: Array[String]) : Unit = {
    val conf = new SparkConf()
      .setAppName("Simple does nothing")
      .setMaster("local").set("spark.driver.memory", "1g")



    val sc = new SparkContext(conf)

    val list = List(1,2)

    val simpleRDD = sc.parallelize(list)

    simpleRDD.foreach { x => println(x) }

  }

}
