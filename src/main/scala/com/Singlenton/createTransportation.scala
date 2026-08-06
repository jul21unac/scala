package com.Singlenton

case class Transportation( typ: String , mumChair : Int )



object createTransportation {

  def factoryRamdonData():Transportation  = {

    val typ = scala.util.Random.alphanumeric.take(10).mkString
    val mumChair = scala.util.Random.nextInt(50)

    new Transportation(typ, mumChair)

  }


}
