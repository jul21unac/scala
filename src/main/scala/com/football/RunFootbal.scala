package com.football

import scala.collection.mutable.ListBuffer

object RunFootbal {

  def main(arg: Array[String])
  {

    val players = createTeam(Array(3,5,2),"Random FC")

    players.foreach(println)

  }

def createTeam(tactic: Array[Int], nombre: String ) : ListBuffer[Player] =
{
  if (tactic.length != 3) throw new Exception
    val players = ListBuffer.empty[Player]
    var usedNames = ListBuffer.empty[String]

    def addPlayer(position: String): Unit = {
      val player = FactoryPlayer.NewPlayer(position, usedNames)
      players += player
      usedNames += player.Name
    }

    addPlayer("GoalKeeper")



    for (_ <- 0 until tactic(0)) addPlayer("Defence")
    for (_ <- 0 until tactic(1)) addPlayer("Midfield")
    for (_ <- 0 until tactic(2)) addPlayer("Attack")
  players
}

}
