class Phrase {
  private var _wor_1 = "nothing"
  private var _wor_2 = "anything"

  def wor_1: String = _wor_1
  def wor_1_=(newWord: String ) :Unit =
    {
      _wor_1 = newWord
    }
  def wor_2: String = _wor_2
  def wor_2_=(newWord: String ) :Unit =
  {
    _wor_2 = newWord
  }

  override def toString: String = _wor_1 + " " + _wor_2
}
