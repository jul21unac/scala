package com.MultipleParameterList

object MPListRun {
  
    def main(args: Array[String]): Unit = {
            house()
            val words_3 = List("h","o","m","e")
            val a= foldLeft1[String,String](words_3, "",(m, n) => m + n)
            println(a)

            val str_2 = List("cook","ingenue" ,"reading","writing","swimming","running","playing","eat","clean","car")
            val filtered = filter(str_2, haveIng)
            println(filtered)
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
   
    def foldLeft1[A, B](as: List[A], b0: B, op: (B, A) => B) : B =
      if (as.isEmpty) b0
      else foldLeft1(as.tail, op(b0, as.head), op)

    def filter(str_1 : List[String], f : String => Boolean) : List[String] =     
        if (str_1.isEmpty) str_1
        else if (f( str_1.head) ) str_1.head :: filter(str_1.tail, f)
        else filter(str_1.tail, f)
      
    def haveIng(str_2 : String) : Boolean = 
        if (str_2.endsWith("ing")) true
        else false

      

}