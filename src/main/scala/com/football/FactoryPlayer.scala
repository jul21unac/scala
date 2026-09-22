package com.football
import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object FactoryPlayer {

  val teams = createTeams

  def NewPlayer(typePlayer: String): Player = {

    val RealMadrid = findTeam("Real Madrid", teams)
    // new Team(name = "Real Madrid", league = "La Liga", "Spain", 433)

    var defensePlay: ListBuffer = FootbalData.DefensePlayers

    var attackPlay: ListBuffer = FootbalData.attack

    var goolKeeper: ListBuffer = FootbalData.GoalKeeper

    var midFieldPla: ListBuffer = FootbalData.Midfield

    val d = getInt(1, defensePlay.size)
    val a = getInt(1, attackPlay.size)
    val g = getInt(1, goolKeeper.size)
    val m = getInt(1, midFieldPla.size)

    typePlayer.toLowerCase match {

      case "defence" =>
        new Defence(
          FootbalData.DefensePlayers(d)._1,
          getInt(17, 45),
          "Defence",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          findTeam(FootbalData.DefensePlayers(d)._2, teams),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100)
        )
      case "attack" =>
        new Attack(
          FootbalData.attack(a)._1,
          getInt(17, 45),
          "Attack",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          findTeam(FootbalData.DefensePlayers(a)._2, teams),
          getInt(0, 100),
          getInt(0, 100)
        )
      case "midfield" =>
        new Midfield(
          FootbalData.midFieldPlayer(m)._1,
          getInt(17, 45),
          "Attack",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          findTeam(FootbalData.DefensePlayers(m)._2, teams),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100),
          getInt(0, 100)
        )
      case "goalkeeper" =>
        new GoalKeeper(
          FootbalData.goalkeeper(g)._1,
          getInt(17, 45),
          "Attack",
          getInt(50, 100),
          getInt(0, 50),
          getInt(0, 100),
          getInt(0, 100),
          findTeam(FootbalData.DefensePlayers(g)._2, teams),
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
