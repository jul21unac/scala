package com.football

class Midfield(
    val Name: String,
    val age: Int,
    val Position: String,
    var GamePlay: Int,
    var Starts: Int,
    var Pass: Int,

    var Fouls: Int,

    var ActualTeam: Team,

    var passCompletionRate: Int,

    var progressivePasses: Int,

    var expectedAssists: Int,

    var finalThirdEntries: Int
) extends Player {}
