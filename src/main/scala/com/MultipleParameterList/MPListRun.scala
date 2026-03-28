package com.MultipleParameterList

object MPListRun {
  
    def main(args: Array[String]): Unit = {
            house()
    }

    def house()
    {
        val words = List("c", "o", "n", "g", "r", "a", "t", "u", "l", "a", "t", "i", "o", "n", "s")
        val res = words.foldLeft("")((m, n) => m + n)
        println(res)

        val word_2 = List("w", "e", "l", "c", "o", "m", "e")
        val res_2 = word_2.foldLeft("")((m, n) => m + n)

        println(res_2)

        val word_3 = List("t","o"," ","H","o","m","e")
        val res_3 = foldLeft1[String, String](word_3, "", _ + _)
        println(res_3)
    }
    def foldLeft1[A, B](as: List[A], b0: B, op: (B, A) => B) = ???



}
