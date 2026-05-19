package com.RegularExpressionPatterns
import scala.io.Source

class LoadCsvFile {

    def loadCsv(filePath: String): Unit = {
        val source = Source.fromFile(filePath)
        val lines = source.getLines().toList
        source.close()

        if (lines.isEmpty) {
             List.empty
        }
        var i = 0
        for (line <- lines) {
            val fields = line.split(",").map(_.trim)
            //println(fields.mkString(", "))
             i=i+1
            println( s"Line $i: $line" )
        }
        
    }
  
}
