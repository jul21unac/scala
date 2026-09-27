package com.football

class Defence(
    val name: String,

    val age: Int,

    val position: String,

    var gamePlay: Int,

    var starts: Int,

    var pass: Int,

    var fouls: Int,

    var actualTeam: Team,

    var tackles: Int,
    var interceptions: Int,
    var clearances: Int,
    var blocks: Int
) extends Player
