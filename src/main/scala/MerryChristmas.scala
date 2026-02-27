class MerryChristmas(ChristmasPhrase: String , Country: String ) extends HollydayPhrase {
  override def Regards(name: String): Unit = {
    println(ChristmasPhrase + name + " From " + Country)
  }
}
