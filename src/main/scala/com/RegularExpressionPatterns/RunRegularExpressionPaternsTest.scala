package com.RegularExpressionPatterns

object RunRegularExpressionPatternsTest {
  def main(args: Array[String]): Unit = {

    val loadCsvFile = new LoadCsvFile()
    loadCsvFile.loadCsv("src/data/olist_order_reviews_dataset.csv")

  }
}
