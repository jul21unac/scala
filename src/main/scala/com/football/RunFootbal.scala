package com.football

object RunFootbal {

  def main(arg: Array[String])
  {

    val defen_2 = FactoryPlayer.NewPlayer("Defence")

    val attPla = FactoryPlayer.NewPlayer("attack")

    val team1 = FactoryTeam.NewTeam("Barza")

    val miedPla = FactoryPlayer.NewPlayer("midField")

    val goalKPla = FactoryPlayer.NewPlayer("GoalKeeper")

    // println(Defen_1.Name)
    println(defen_2.Name)
    println(attPla.Name)
    println(team1.name + team1.Strategy)
    println(miedPla.Name)
    println(goalKPla.Name)

  }

}
