package com.football

class Attack(
    val Name: String,
    val age: Int,
    val Position: String,
    var GamePlay: Int,
    var Starts: Int,
    var Pass: Int,

    var Fouls: Int,

    var ActualTeam: Team,

    var Gol: Int,
    var Asistence: Int
) extends Player
