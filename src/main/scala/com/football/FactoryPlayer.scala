package com.football
import scala.util.Random
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer

object FactoryPlayer {

  val teams = createTeams

  def NewPlayer(typePlayer: String, usedNames: ListBuffer[String]): Player = {

    var defensePlay= FootbalData.DefensePlayers

    var attackPlay = FootbalData.attack

    var goolKeeper = FootbalData.goalkeeper

    var midFieldPla = FootbalData.midFieldPlayer

    val d = getInt(0, defensePlay.size-1)
    val a = getInt(0, attackPlay.size-1)
    val g = getInt(0, goolKeeper.size-1)
    val m = getInt(0, midFieldPla.size-1)

    typePlayer.toLowerCase match {

      case "defence" =>
      val (name, team) =
        chooseAvailable(FootbalData.DefensePlayers, usedNames)        
        new Defence(
          name,
          getInt(17, 45),
          "Defence",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          findTeam(team, teams),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100)
        )
      case "attack" =>
      val (name, team) =
        chooseAvailable(FootbalData.attack, usedNames)          
        new Attack(
          name,
          getInt(17, 45),
          "Attack",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          findTeam(team, teams),
          getInt(0, 100),
          getInt(0, 100)
        )
      case "midfield" =>
      val (name, team) =
        chooseAvailable(FootbalData.midFieldPlayer, usedNames)          
        new Midfield(
          name,
          getInt(17, 45),
          "Midfield",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          findTeam(team, teams),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100)
        )
      case "goalkeeper" =>
      val (name, team) =
        chooseAvailable(FootbalData.goalkeeper, usedNames)          
        new GoalKeeper(
          name,
          getInt(17, 45),
          "GoalKeeper",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          findTeam(team, teams),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100)
        )
      case _ => throw new IllegalArgumentException("Unknown Player type")
    }
  }

  def getInt(rangI: Int, rangF: Int): Int = {
    val rand = new scala.util.Random
    rand.between(rangI, rangF)

  }

  def createTeams(): ArrayBuffer[(Team)] = {
    val listTeam = ArrayBuffer.empty[Team]

    val teams: List[(String)] = FootbalData.teams

    teams.foreach(elem => listTeam.append(FactoryTeam.NewTeam(elem)))

    listTeam

  }

  def findTeam(teamName: String, teams: ArrayBuffer[(Team)]): Team = {
    
    val teamf = teams.filter(_.name.equalsIgnoreCase(teamName))

    if (teamf.size == 0 ) 
      {
        println(teamName)
        throw new Exception(teamName)
      }
    teamf(0)
   

  }
  def chooseAvailable(   playe: Seq[(String, String)],   usedName: ListBuffer[String] ): (String, String) = {
  val disponibles = playe.filterNot {
    case (playe, _) => usedName.contains(playe)
  }

  require(disponibles.nonEmpty, "no players")
  disponibles(Random.nextInt(disponibles.size))
}

}
