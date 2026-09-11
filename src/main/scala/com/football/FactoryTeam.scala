package com.football

object FactoryTeam {
  val strategy: Array[Int] = Array(
    433, 442, 451, 532, 541, 352, 343, 424
  )
  def NewTeam(nameTeam: String): Team = {

    new Team(nameTeam, "La Liga", "Spain", strategy(getInt(0, 7)))

  }

  def getInt(rangI: Int, rangF: Int): Int = {
    val rand = new scala.util.Random
    rand.between(rangI, rangF)

  }

}
