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
             val regex = """([A-Za-z0-9]+),([A-Za-z0-9]+),([0-9]+)""".r
             line match {
                 case regex(review_id,order_id,review_score) => println(s"Line $i: Review ID=$review_id, Order ID=$order_id, Review Score=$review_score")
                 case _ => println(s"Line $i: $line")
             }
        }
        
    }
  
}
