package com.football

class GoalKeeper(
    val name: String,
    val age: Int,
    val position: String,
    var gamePlay: Int,
    var starts: Int,
    var pass: Int,

    var fouls: Int,

    var actualTeam: Team,

    var cleanSheets: Int,

    var savePercentage: Int,

    var sweepingActions: Int,

    var passCompletion: Int
) extends Player
