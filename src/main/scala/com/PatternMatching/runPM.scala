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


  
}
