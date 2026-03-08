package com.traitPractice

import scala.util.Random

class WordGenerator( listWords: List[String]) extends NextWord [String]{

  var num: Int = 0
  override def nextW(): String = {

    if ( hasWords ) {
      val resu = listWords(num)

      num=num+1
      resu

    }
    else
      "nothing"



  }

  override def hasWords: Boolean = num < listWords.length
}
