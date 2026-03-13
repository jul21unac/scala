package com.ClassCompositionwithMixins

object RunClassWM {

  def main(args: Array[String]): Unit={
    val An = new AnyMorning()
    println(An.quote)
    println(An.inTheMorning)

    val anis = List("Bear","Shark","Horse","Pig", "Tiger","Lion")

    val zai = new ZooAnimalIter(anis)
    zai.forEach(println)

  }

}
