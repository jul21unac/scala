package com.traitPractice

trait Country {

  val Capital : String
  var budget :Integer
  val costOfUniversity:Int = 500

  val costOfSchools:Int=  400

  val costOfHospitals:Int = 800

  val costOfHW:Int = 350

  var costAcumulate:Int = 0

  var budgetAcumulate: Int = 0

  def createUniversity( qty : Integer, UniBudget:Integer) : Unit
  def createSchools(qty : Integer, schoolBudget : Integer) : Unit
  def createHospitals(qty :Integer, HealtBudget : Integer ) : Unit
  def increaseBudget(qty : Integer ) : Unit ={
    budget= budget+qty
  }
  def setBudget(qty: Integer): Unit =
    {
      budget = qty

    }



  def createHighway(qty :Integer, InfrasBudget : Integer): Unit


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
}
