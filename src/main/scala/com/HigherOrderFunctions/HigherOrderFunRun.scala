package com.HigherOrderFunctions

object HigherOrderFunRun {

  def main(args: Array[String]): Unit = {

    PluralAnimal()
    pluralAnimal2Steps()
    pluralAnimalCurrying()

    val Bills = Seq(34545.55,200,100,3000,31416,23321)
    val Inc = List(45646.5,523423,34324,24234,324234)

    val CNS2E = new ConvertNuevosSoles2Euro(Bills,4.13)
    println(CNS2E.changeNuevosSoles2Euro)

    println(Expenses.taxes(Inc))
    println(Expenses.MobilBill(Inc))
    println(Expenses.EnergyBill(Inc))

    println(ExpenseAndFuntion.taxes(Inc))
    println(ExpenseAndFuntion.MobilBill(Inc))
    println(ExpenseAndFuntion.EnergyBill(Inc))

    var hifun= HelloFuntion.SayHi("Hi", people = false)
    println(hifun("Welcome", "Bye"))



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
