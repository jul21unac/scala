package com.HigherOrderFunctions

class ConvertNuevosSoles2Euro(NuevosSoles : Seq[Double], change : Double) {

  private def toEUro(Bills  : Double) = Bills * change

  def changeNuevosSoles2Euro: Seq[Double]= NuevosSoles.map(toEUro)

}
