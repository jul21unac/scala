package com.traitPractice

class Bolivia extends Country {

  val Capital: String = "La Paz"

  val budget: Integer = 17000

  val costOfUniversity:Int = 500

  val costOfSchools:Int=  400

  val costOfHospitals:Int = 800

  def createUniversity(qty: Integer, UniBudget: Integer): Unit = {


      println(calculateValidate(qty,UniBudget,"University"))

  }

  def createSchools(qty: Integer, schoolBudget: Integer): Unit = {

  }

  def createHospitals(qty: Integer, HealtBudget: Integer): Unit = {

  }
  //TODO : adapt for all the methods
  //TODO: acumulate the costs
  def calculateValidate(qt:Integer, partialBudget:Integer, Orga : String): String= {
    val messageV : String =
    if (partialBudget > budget) {
          "We don't have that budget for "+ Orga
    }  else if( qt*costOfUniversity > budget)
      {  "Reduce the quantity of "+ Orga  }
    else
      { s"Proceed to create  $qt of $Orga" }
    messageV

  }
}
