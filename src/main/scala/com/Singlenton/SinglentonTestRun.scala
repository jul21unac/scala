package com.Singlenton

object SinglentonTestRun {
  
  def main(args: Array[String]) : Unit = {

    val customerNew = CreateCustomer.factoryRandomData()
    val prodcat = CreateProductCategory.factoryRandomData()
    val per = CreatePerson.factoryRandomData()
    println(customerNew)
    println(prodcat.productCategoryNameEnglish)
    println(per)

    
  }

}
