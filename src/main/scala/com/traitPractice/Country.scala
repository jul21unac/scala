package com.traitPractice

trait Country {

  val Capital : String
  var budget :Integer
  def createUniversity( qty : Integer, UniBudget:Integer) : Unit
  def createSchools(qty : Integer, schoolBudget : Integer) : Unit
  def createHospitals(qty :Integer, HealtBudget : Integer ) : Unit
  def increaseBudget(qty : Integer ) : Unit
  //TODO add set budget
  // TODO add create britch path

  // TODO add other kind of cost
}
