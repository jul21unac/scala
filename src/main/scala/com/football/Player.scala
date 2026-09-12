package com.football

trait Player {
  val Name: String

  val age: Int

  val Position: String
  // number of game play
  var GamePlay: Int

  var Starts: Int

  // number of pass
  var Pass: Int
  // number of gols

  var Fouls: Int

  var ActualTeam: Team

}
