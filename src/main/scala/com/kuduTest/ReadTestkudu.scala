package com.kuduTest
import org.apache.kudu.spark.kudu._
import org.apache.spark.sql.{DataFrame, SparkSession}

object ReadTestkudu {

    def main (args: Array[String]) : Unit = 
        {
            val spark = SparkSession.builder()
                .appName("LoadCSVToKudu")
                .master("local[*]")
                .config("spark.driver.host", "127.0.0.1")
                .config("hive.metastore.uris", "thrift://127.0.0.1:9083")
                .config("spark.kudu.operation.timeout.ms", "60000")
                .config("spark.kudu.admin.operation.timeout.ms", "60000")
                .enableHiveSupport()
                .getOrCreate()
            val kr = new KuduTableReader(spark)
            val df = kr.readTable("staging.product_category_name_translation")
            println(df.show(50))
 
        }
  
}
