package com.traitPractice

class Bolivia extends Country {

  val Capital: String = "La Paz"

  var budget: Integer = 1700

  val costOfUniversity:Int = 500

  val costOfSchools:Int=  400

  val costOfHospitals:Int = 800

  var costAcumulate:Int = 0

  var budgetAcumulate: Int = 0

  def createUniversity(qty: Integer, UniBudget: Integer): Unit = {


      calculateValidate(qty,costOfUniversity,UniBudget,"University")

  }

  def createSchools(qty: Integer, schoolBudget: Integer): Unit = {
    calculateValidate(qty,costOfSchools,schoolBudget,"School")
  }

  def createHospitals(qty: Integer, HealtBudget: Integer): Unit = {
    calculateValidate(qty,costOfHospitals,HealtBudget,"Hospital")
  }

  def calculateValidate(qt:Integer,cost: Integer, partialBudget:Integer, Orga : String): Unit= {
    println("acumulado")
    println(costAcumulate + qt*cost  )
    println(budget)
    if (partialBudget > budget) {
          println("We don't have that budget for "+ Orga)
    } else if ( budgetAcumulate + partialBudget> budget )
    {       println("We don't have that budget for "+ Orga)  }
    else if( qt*cost > partialBudget)
      {  println("Reduce the quantity of "+ Orga ) }
    else if( (costAcumulate + qt*cost) > budget)
    {  println("Reduce the quantity of "+ Orga ) }
    else
      {
        budgetAcumulate= budgetAcumulate + partialBudget
        costAcumulate = costAcumulate + qt*cost
        println(s"Proceed to create  $qt of $Orga")
      }
      println(costAcumulate)


  }

  def increaseBudget(qty: Integer): Unit = {


  }
}
