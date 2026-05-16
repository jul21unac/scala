package com.RegularExpressionPatterns
import scala.io.Source

class LoadCsvFile {

    def loadCsv(filePath: String): List[Map[String, String]] = {
        val source = Source.fromFile(filePath)
        val lines = source.getLines().toList
        source.close()

        if (lines.isEmpty) {
            return List.empty
        }

        val headers = lines.head.split(",").map(_.trim)
        val data = lines.tail.map { line =>
            val values = line.split(",").map(_.trim)
            headers.zip(values).toMap
        }
        data
    }
  
}
