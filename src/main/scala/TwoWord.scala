class TwoWord(var word_1: String, var word_2: String) {

  def addAnotherWord(  word_3: String,  word_4: String ): Unit = {
          word_1 = word_1 + word_3
          word_2 = word_2 + word_4
  }

  override def toString: String = word_1 +" , "+ word_2
}
