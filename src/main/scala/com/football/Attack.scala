package com.football

class Attack(
    val name: String,
    val age: Int,
    val position: String,
    var gamePlay: Int,
    var starts: Int,
    var pass: Int,

    var fouls: Int,

    var actualTeam: Team,

    var gol: Int,
    var asistence: Int
) extends Player
