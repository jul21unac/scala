package com.ClassCompositionwithMixins

class AnimalIterator( a: List[String] ) extends Zoo {

  type Animal = String
  private var i = 0


  def next(): String ={
    val ani = a(i)
    i+=1
    ani
  }

  def finish: Boolean = i< a.length
}





