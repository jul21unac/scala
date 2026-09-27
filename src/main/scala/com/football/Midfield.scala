package com.football

class Midfield(
    val name: String,
    val age: Int,
    val position: String,
    var gamePlay: Int,
    var starts: Int,
    var pass: Int,

    var fouls: Int,

    var actualTeam: Team,

    var passCompletionRate: Int,

    var progressivePasses: Int,

    var expectedAssists: Int,

    var finalThirdEntries: Int
) extends Player {}
