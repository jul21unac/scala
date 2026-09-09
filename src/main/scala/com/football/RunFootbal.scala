package com.football

object RunFootbal {

  def main(arg: Array[String])
  {

    val RealMadrid =
      new Team(name = "Real Madrid", league = "La Liga", "Spain", 433)

    val Defen_1 = new Defence(
      Name = "Marc Cucurella",
      23,
      "Defence",
      12,
      12,
      45,
      0,
      32,
      43,
      44,
      23,
      34,
      2,
      RealMadrid
    )

    val defen_2 = FactoryPlayer.NewPlayer("Defence")

    println(Defen_1.Name)
    println(defen_2.Name)

  }

}
