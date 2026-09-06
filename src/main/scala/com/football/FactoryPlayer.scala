package com.football

object FactoryPlayer {

  def NewPlayer(typePlayer: String): Player = typePlayer.toLowerCase match {

    case "defence" => new Defence()
    case "attack"  => new Attack()
    case _         => throw new IllegalArgumentException("Unknown Player type")

  }

  def getInt(rangI: Int, rangF: Int): Int = {
    val rand = new scala.util.Random
    rand.between(rangI, rangF)

  }

}
