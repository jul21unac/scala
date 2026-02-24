object ScalaBasic {

  def main(args: Array[String]): Unit = {
    println("========home============")

    println(home)
    print("=" * 50)
    print("Cube")
    print("=" * 50)
    print("\n")
    println(getCubeString(3))

    print("=" * 50)
    print("Happy New Year")
    print("=" * 50)
    print("\n")
    val Happy = new HappyNewYear("Julio"," All the best for you")
    Happy.ChineseYear("The best")
  }

  def home: String = System.getProperty("user.home")

  def getCubeString(num: Double): String = {
    val cube = num*num*num
    cube.toString
  }
}
