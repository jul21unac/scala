package com.football

trait Player {
  val name: String

  val age: Int

  val position: String
  // number of game play
  var gamePlay: Int

  var starts: Int

  // number of pass
  var pass: Int
  // number of gols

  var fouls: Int

  var actualTeam: Team


override def toString(): String = s"Name = $name, age = $age, position =$position"

}
