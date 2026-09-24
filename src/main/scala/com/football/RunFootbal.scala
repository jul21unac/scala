package com.football

import scala.collection.mutable.ListBuffer

object RunFootbal {

  def main(arg: Array[String])
  {

    val defen_2 = FactoryPlayer.NewPlayer("Defence")

    val attPla = FactoryPlayer.NewPlayer("attack")

    val team1 = FactoryTeam.NewTeam("Barza")

    val miedPla = FactoryPlayer.NewPlayer("midField")

    val goalKPla = FactoryPlayer.NewPlayer("GoalKeeper")

    // println(Defen_1.Name)
    /*
    println(defen_2.Name)
    println(attPla.Name)
    println(team1.name + team1.Strategy)
    println(miedPla.Name)
    println(goalKPla)
*/

    val players = createTeam(Array(3,5,2),"Random FC")

    players.foreach(println)

  }

def createTeam(tactic: Array[Int], nombre: String ) : ListBuffer[Player] =
{
  if (tactic.length != 3) throw new Exception

  val players: ListBuffer[Player] = ListBuffer.empty[Player]
  players.append(FactoryPlayer.NewPlayer("GoalKeeper") )
  for ( i  <- 0 until tactic(0)  )
  {
    players.append(FactoryPlayer.NewPlayer("Defence") )
  }
  for ( i  <- 0 until tactic(1)  )
  {
    players.append(FactoryPlayer.NewPlayer("midField") )
  }
  for ( i  <- 0 until tactic(2)  )
  {
    players.append(FactoryPlayer.NewPlayer("attack") )
  }
  players
}

}
