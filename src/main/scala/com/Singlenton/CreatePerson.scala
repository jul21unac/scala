package com.Singlenton

case class Person( val Dni: String, val name: String
                    , val LastName: String,
                   val CityBorn: String, val CityLive: String) {
  

    
}

object CreatePerson{

    def factoryRandomData() : Person = {
        val dni = scala.util.Random.alphanumeric.take(10).mkString
        val name = scala.util.Random.alphanumeric.take(15).mkString
        val lastName = scala.util.Random.nextInt(99999).toString
        val cityborn = scala.util.Random.alphanumeric.take(8).mkString
        val statelive = scala.util.Random.alphanumeric.take(2).mkString

        new Person(dni, name, lastName, cityborn, statelive)
    }
}



