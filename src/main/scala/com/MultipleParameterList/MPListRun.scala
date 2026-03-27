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
    }

}
