package com.football

class GoalKeeper(
    val Name: String,
    val age: Int,
    val Position: String,
    var GamePlay: Int,
    var Starts: Int,
    var Pass: Int,

    var Fouls: Int,

    var ActualTeam: Team,

    var CleanSheets: Int,

    var SavePercentage: Int,

    var SweepingActions: Int,

    var PassCompletion: Int
) extends Player
