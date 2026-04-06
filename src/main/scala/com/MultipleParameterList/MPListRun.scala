package com.MultipleParameterList

object MPListRun {
  
    def main(args: Array[String]): Unit = {
            house()
            val words_3 = List("h","o","m","e")
            val a= foldLeft1[String,String](words_3, "",(m, n) => m + n)
            println(a)

            val str_2 = List("cook","ingenue" ,"reading","writing","swimming","running","playing","eat","clean","car")
            val filtered = filter(str_2)(haveIng _)
            println(filtered)
            val numb = List(1,1,2,3,5,8,13)
            val mul2 = mult(2)_
            print(numb.map(mul2))

            
    }

    def house()
    {
        val words = List("c", "o", "n", "g", "r", "a", "t", "u", "l", "a", "t", "i", "o", "n", "s")
        val res = words.foldLeft("")((m, n) => m + n)
        println(res)

        val word_2 = List("w", "e", "l", "c", "o", "m", "e")
        val res_2 = word_2.foldLeft("")((m, n) => m + n)

        println(res_2)

        val names = List("Alice", "Bob", "Charlie")
        val adjectives = List("smart", "kind", "funny")
        val badWords = List("bad", "ugly", "nasty")
        val sentences = twoStrList(names, adjectives)(makeSentence)
        println(sentences)




    }
   
    def foldLeft1[A, B](as: List[A], b0: B, op: (B, A) => B) : B =
      if (as.isEmpty) b0
      else foldLeft1(as.tail, op(b0, as.head), op)

    def filter(str_1 : List[String])( f : String => Boolean) : List[String] =     
        if (str_1.isEmpty) str_1
        else if (f( str_1.head) ) str_1.head :: filter(str_1.tail)(f)
        else filter(str_1.tail)(f)
      
    def haveIng(str_2 : String) : Boolean = 
        if (str_2.endsWith("ing")) true
        else false
 

    def twoStrList(str_1 :List[String], str_2 : List[String] )( f: (String, String) => String) : List[String] =
      if (str_1.isEmpty || str_2.isEmpty) Nil
      else f(str_1.head, str_2.head) :: twoStrList(str_1.tail, str_2.tail)(f)


    def makeSentence(str_1 : String, str_2 : String) : String = 
        str_1 + " is " + str_2

    def mult(x: Int)(y: Int): Int = x*y


    def greater(a: List[Int])(f: (Int,Int) => Int) : Int 
        if (a.isEmpty) a
        else f(a.head, greater(a.tail)(f))



    
    




    

}