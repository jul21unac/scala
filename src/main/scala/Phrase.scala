class Phrase {
  private var _wor_1 = "nothing"
  private var _wor_2 = "anything"
  private var forbiddenWord = "war"

  def wor_1: String = _wor_1
  def wor_1_=(newWord: String ) :Unit =
    {
      if (newWord != forbiddenWord)
        _wor_1 = newWord
      else
        printAlarm()
    }
  def wor_2: String = _wor_2
  def wor_2_=(newWord: String ) :Unit =
  {
    if (newWord != forbiddenWord)
      _wor_2 = newWord
    else
      printAlarm()
  }

  def printAlarm(): Unit ={
    println("forbidden word")
  }

  override def toString: String = _wor_1 + " " + _wor_2
}
