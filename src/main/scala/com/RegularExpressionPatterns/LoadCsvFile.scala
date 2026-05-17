package com.RegularExpressionPatterns
import scala.io.Source

class LoadCsvFile {

    def loadCsv(filePath: String): Unit = {
        val source = Source.fromFile(filePath)
        val lines = source.getLines().toList
        source.close()

        if (lines.isEmpty) {
            return List.empty
        }

        for (line <- lines) {
            val fields = line.split(",").map(_.trim)
            println(fields.mkString(", "))
        }
        
    }
  
}
