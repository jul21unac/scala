package com.football
import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object FactoryPlayer {

  val d = 0
  val teams = createTeams

  def NewPlayer(typePlayer: String): Player = {

    val RealMadrid = findTeam("Real Madrid", teams)
    // new Team(name = "Real Madrid", league = "La Liga", "Spain", 433)

    var defensePlay: ListBuffer = FootbalData.DefensePlayers

    var attackPlay: ListBuffer = FootbalData.attack

    var goolKeeper: ListBuffer = FootbalData.GoalKeeper

    var midFieldPla: ListBuffer = FootbalData.Midfield

    // defensePlay.

    typePlayer.toLowerCase match {

      case "defence" =>
        new Defence(
          FootbalData.DefensePlayers(getInt(1, defensePlay.size))._1,
          getInt(17, 45),
          "Defence",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          RealMadrid,
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100)
        )
      case "attack" =>
        new Attack(
          FootbalData.attack(getInt(1, attackPlay.size))._1,
          getInt(17, 45),
          "Attack",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          RealMadrid,
          getInt(0, 100),
          getInt(0, 100)
        )
      case "midfield" =>
        new Midfield(
          FootbalData.midFieldPlayer(getInt(1, midFieldPla.size))._1,
          getInt(17, 45),
          "Attack",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          RealMadrid,
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100)
        )
      case "goalkeeper" =>
        new GoalKeeper(
          FootbalData.goalkeeper(getInt(1, goolKeeper.size))._1,
          getInt(17, 45),
          "Attack",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          RealMadrid,
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

    teamf(0)

  }

}
