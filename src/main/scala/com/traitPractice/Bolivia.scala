package com.traitPractice

class Bolivia extends Country {

  val Capital: String = "La Paz"

  var budget: Integer = 0



  def createUniversity(qty: Integer, UniBudget: Integer): Unit = {


      calculateValidate(qty,costOfUniversity,UniBudget,"University")

  }

  def createSchools(qty: Integer, schoolBudget: Integer): Unit = {
    calculateValidate(qty,costOfSchools,schoolBudget,"School")
  }

  def createHospitals(qty: Integer, HealtBudget: Integer): Unit = {
    calculateValidate(qty,costOfHospitals,HealtBudget,"Hospital")
  }


  def createHighway(qty: Integer, InfrasBudget: Integer): Unit = {

    calculateValidate(qty,costOfHW,InfrasBudget,"Highway")

  }
}
