package com.football

class Midfield(
    val Name: String,
    val age: Int,
    val Position: String,
    var GamePlay: Int,
    var Starts: Int,
    var Pass: Int,

    var Fouls: Int,

    var ActualTeam: Team
) extends Player {}
