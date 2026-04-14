package com.PatternMatching

object runPM {
    def main ( args: Array[String] ) : Unit = {

        println(matchRomanNumber(1))
        println(matchRomanNumber(2))
        println(matchRomanNumber(10))
        println(matchRomanNumber(5))

        println(matchMonth(1))
        println(matchMonth(5))
        println(matchMonth(12))
        println(matchMonth(15))

        val fauto = automobile(5, 4)
        val fmoto = motorcycle(2, 2)
        val ftruck = truck(3, 6)

        println(showInfoVehicle(fauto))
        println(showInfoVehicle(fmoto))
        println(showInfoVehicle(ftruck))

        val sente: String = "Alice earns 5000 dollars per month"
        val pattern = "(.+) earns (.+) dollars per month".r
        println(
        sente match {
            case pattern(name, amount) => s"$name's salary is $amount dollars"
            case _ => "the sentence is not in the correct format"
        }
        )
    }
  
  def matchRomanNumber( num: Int) : String={
        num match {
            case 1 => "I"
            case 2 => "II"
            case 3 => "III"
            case 4 => "IV"
            case 10 => "X"
            case _ => "I have to put more numbers sorry, next time"

        }
  }


  def matchMonth( numMonth: Int) : String={

        numMonth match {

            case 1 => "Enero"
            case 2 => "Febrero"
            case 3 => "Marzo"
            case 4 => "Abril"
            case 5 => "Mayo"
            case 6 => "Junio"
            case 7 => "Julio"
            case 8 => "Agosto"
            case 9 => "Septiembre"
            case 10 => "Octubre"
            case 11 => "Noviembre"
            case 12 => "Diciembre"
            case _ => "only number from 1 to 12, sorry"

        }
  }

  def showInfoVehicle(v : vehicle) : String = {

    v match {
        case automobile(numSeats, numWheels) => s"the automobile have $numSeats seats and $numWheels wheels"
        case motorcycle(numSeats, numWheels) => s"the motorcycle have $numSeats seats and $numWheels wheels"
        case truck(numSeats, numWheels) => s"the truck have $numSeats seats and $numWheels wheels"
    }


  }
  
}


sealed trait vehicle

case class automobile(numSeats: Int,  numWheels: Int) extends vehicle
case class motorcycle(numSeats: Int, numWheels: Int) extends vehicle
case class truck(numSeats: Int, numWheels: Int) extends vehicle


