package com.tuplesPractice

class tuplesClass {

  def monthTuples(): Unit = {
    val monthWork = ("Junary", 1)
    println(monthWork._1)
    println(monthWork._2)

    val (nameMonth, numMonth) = monthWork
    println(s"name of month : $nameMonth")
    println(s"Number of month : $numMonth")

  }
  def bookTuples(): List[(String,Int)] = {

      val bookPages = List(("Crime and punishment",1020),("War and peace",123123)
      , ("Train of Siberia",32423))
      bookPages

    }
    def PrintBook(): Unit = {

      val boock = bookTuples()
      boock.foreach{
        case("Crime and punishment", pages) => println(s"C and P have $pages pages")
        case _ =>
      }

    }

    def NamesNicks(): Unit={

      val NN = List(("Jhonthan", "Snake"), ("Luis","Rat"), ("Eulogio","Saint"))
      for ((a,b)<- NN)
        {
          println(s"The nick name of $a is $b")
        }
    }



}
