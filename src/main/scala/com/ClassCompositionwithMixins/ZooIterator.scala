package com.ClassCompositionwithMixins

trait ZooIterator extends Zoo {

  def forEach(f: Animal => Unit): Unit = while(finish) f(next())

}
