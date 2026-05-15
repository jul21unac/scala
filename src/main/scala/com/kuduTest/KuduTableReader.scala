package com.kuduTest

import org.apache.kudu.spark.kudu._
import org.apache.spark.sql.{DataFrame, SparkSession}

class KuduTableReader(spark: SparkSession) {

  private val KUDU_MASTERS = "127.0.0.1:7051,127.0.0.1:7052,127.0.0.1:7053"

  /**
   * Lee una tabla de Kudu por su nombre
   *
   * @param tableName nombre de la tabla a leer (ej: "staging.customers")
   * @return DataFrame con los datos de la tabla
   */
  def readTable(tableName: String): DataFrame = {
    spark.read
      .options(Map("kudu.master" -> KUDU_MASTERS, "kudu.table" -> tableName))
      .format("org.apache.kudu.spark.kudu")
      .load()
  }

}