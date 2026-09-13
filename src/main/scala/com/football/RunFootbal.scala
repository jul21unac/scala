package com.football

object RunFootbal {

  def main(arg: Array[String])
  {

    val defen_2 = FactoryPlayer.NewPlayer("Defence")

    val attPla = FactoryPlayer.NewPlayer("attack")

    val team1 = FactoryTeam.NewTeam("Barza")

    // println(Defen_1.Name)
    println(defen_2.Name)
    println(attPla.Name)
    println(team1.name + team1.Strategy)

  }

}
