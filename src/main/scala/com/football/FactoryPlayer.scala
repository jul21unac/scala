package com.football
import scala.util.Random

object FactoryPlayer {

  val d = 0
  def NewPlayer(typePlayer: String): Player = {

    val RealMadrid =
      new Team(name = "Real Madrid", league = "La Liga", "Spain", 433)

    typePlayer.toLowerCase match {

      case "defence" =>
        new Defence(
          FutbolData.DefensePlayers(d)._1,
          getInt(17, 45),
          "Defence",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          RealMadrid
        )
      // case "attack"  => new Attack()
      case _ => throw new IllegalArgumentException("Unknown Player type")

    }

  }

  def getInt(rangI: Int, rangF: Int): Int = {
    val rand = new scala.util.Random
    rand.between(rangI, rangF)

  }

}
