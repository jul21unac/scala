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
  var Gol: Int

  var Asistence: Int

  var Tackles: Int
  var Interceptions: Int
  var Clearances: Int
  var Blocks: Int
  var Fouls: Int

  var ActualTeam: Team

}
