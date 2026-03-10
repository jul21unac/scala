package com.ClassCompositionwithMixins

object RunClassWM {

  def main(args: Array[String]): Unit={
    val An = new AnyMorning()
    println(An.quote)
    println(An.inTheMorning)
  }

}
