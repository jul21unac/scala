package com.Singlenton

case class Customer( val CustomerID: String, val Customer_unique_id: String
                    , val Customer_zip_code_prefix: String, val Customer_city: String, val Customer_state: String) {
  

    
}

object CreateCustomer{

    def factoryRandomData() : Customer = {
        val id = scala.util.Random.alphanumeric.take(10).mkString
        val uniqueId = scala.util.Random.alphanumeric.take(15).mkString
        val zipCode = scala.util.Random.nextInt(99999).toString
        val city = scala.util.Random.alphanumeric.take(8).mkString
        val state = scala.util.Random.alphanumeric.take(2).mkString

        new Customer(id, uniqueId, zipCode, city, state)
    }
}



