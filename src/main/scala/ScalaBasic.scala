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

    print("=" * 50)
    print("Coordinates")
    print("=" * 50)
    print("\n")

    compareCoordinate()

    print("=" * 50)
    print("Fabric Identity")
    print("=" * 50)
    print("\n")

    val Identity: Int = Facbric.create()
    val NewIdentity: Int = Facbric.create()

    println(Identity)
    println(NewIdentity)

  }

  def home: String = System.getProperty("user.home")

  def getCubeString(num: Double): String = {
    val cube = num*num*num
    cube.toString
  }

  def compareCoordinate() : Unit= {
    val coordinate_1 = Coordinate(2,4)
    val coordinate_2 = Coordinate(2,4)
    val coordinate_3 = Coordinate(2,5)

    if (coordinate_1 == coordinate_2)
    {
      println(s"$coordinate_1 are equal to $coordinate_2")
    }else
    {
      println(s"$coordinate_1 are different to $coordinate_2")
    }

    if (coordinate_1 == coordinate_3)
    {
      println(s"$coordinate_1 are equal to $coordinate_3")
    }
    else
    {
      println(s"$coordinate_1 are different to $coordinate_3")
    }

  }
}
