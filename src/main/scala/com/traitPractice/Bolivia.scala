package com.traitPractice

class Bolivia extends Country {

  val Capital: String = "La Paz"

  val budget: Integer = 17000

  val costOfUniversity:Int = 500

  val costOfSchools:Int=  400

  val costOfHospitals:Int = 800

  var costAcumulate:Int = 0

  def createUniversity(qty: Integer, UniBudget: Integer): Unit = {


      calculateValidate(qty,costOfUniversity,UniBudget,"University")

  }

  def createSchools(qty: Integer, schoolBudget: Integer): Unit = {
    calculateValidate(qty,costOfSchools,schoolBudget,"School")
  }

  def createHospitals(qty: Integer, HealtBudget: Integer): Unit = {
    calculateValidate(qty,costOfHospitals,HealtBudget,"Hospital")
  }
  //TODO : adapt for all the methods
  //TODO: acumulate the costs
  def calculateValidate(qt:Integer,cost: Integer, partialBudget:Integer, Orga : String): Unit= {

    if (partialBudget > budget) {
          println("We don't have that budget for "+ Orga)
    }  else if( qt*cost > partialBudget)
      {  println("Reduce the quantity of "+ Orga ) }
    else if( costAcumulate + qt*cost > budget)
    {  println("Reduce the quantity of "+ Orga ) }
    else
      {costAcumulate = costAcumulate + qt*cost
        println(s"Proceed to create  $qt of $Orga")
      }


  }
}
