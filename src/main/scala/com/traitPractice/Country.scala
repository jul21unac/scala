package com.traitPractice

trait Country {

  val Capital : String
  val budget :Integer
  def createUniversity( qty : Integer, UniBudget:Integer) : Unit
  def createSchools(qty : Integer, schoolBudget : Integer) : Unit
  def createHospitals(qty :Integer, HealtBudget : Integer ) : Unit
}
