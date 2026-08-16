package com.traitPractice

object traitExampleRun {

  def main(args: Array[String]): Unit ={

    val Bol = new Bolivia()
    Bol.setBudget(2000)
    Bol.increaseBudget(1000)
    Bol.createUniversity(1,800)
    Bol.createHospitals(1,900)
    Bol.createSchools(1,800)




  }

}
