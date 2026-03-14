package com.HigherOrderFunctions

object HigherOrderFunRun {

  def main(args: Array[String]): Unit = {

    PluralAnimal()
    pluralAnimal2Steps()
    pluralAnimalCurrying()

  }

  def PluralAnimal(): Unit = {

    val Animals = Seq("Lyon","Bear","Pig","Dog")
    val toPlural = (x: String) => x + "s"
    val PluAnimal = Animals.map(toPlural)
    println(PluAnimal.toString())

  }

  def pluralAnimal2Steps(): Unit = {

    val Animals = Seq("Lyon","Bear","Pig","Dog")
    val PluAnimal = Animals.map((x: String) => x + "s")
    println(PluAnimal.toString())

  }

  def pluralAnimalCurrying(): Unit={

    val Animals = Seq("Lyon","Bear","Pig","Dog")
    val PluAnimal = Animals.map(_ + "s")
    println(PluAnimal.toString())

  }

}
