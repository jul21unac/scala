package com.HigherOrderFunctions

object HelloFuntion {
  def SayHi(HiStr: String, people: Boolean): (String, String) => String = {
    val cadStr = if (people) "People" else "You"
    (Start: String, end: String) => s"$Start $HiStr $cadStr $end"
  }
}