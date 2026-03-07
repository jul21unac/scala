import com.traitPractice.WordGenerator

import java.security.KeyStore.TrustedCertificateEntry

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

    traitPractice()
    typesPractice()

    suma(Some(1.0), Some(2.0))
    suma(None, Some(2.0))
    suma(Some(1.0), None)
    castTypes()

    val simC = new SimpleClass()

    val tw = new TwoWord( "hap","birth" )
    println(tw.toString)
    println(tw.word_1)
    tw.addAnotherWord("py","day")
    println(tw.toString)

    var wo = new Words(fw="third")
    println(wo)
    var phra = new Phrase
    phra.wor_1 = "hola"
    println(phra)
    var phra2 = new Phrase
    phra2.wor_1 = "civil"
    phra2.wor_2 =  "war"

    var ani = new Animal
    ani.printAnimalData(nickName = "Gordo", typ = "Cat")
    ani.printAnimalData( typ = "Cat", nickName = "Gordo")
    ani.printAnimalData( color = "White ",typ = "Cat", nickName = "Gordo")

    var wg = new WordGenerator(List("blue", "red", "green", "yellow"))
    println(wg.nextW())
    println(wg.nextW())
    println(wg.nextW())
    println(wg.nextW())
    println(wg.nextW())
    println(wg.nextW())
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
  def traitPractice() : Unit = {

    print("=" * 50)
    print("Traits Example")
    print("=" * 50)
    print("\n")
    val Sim = new SimpleRegards()
    Sim.Regards(" Julio")

    val Feliz = new MerryChristmas("Merry Christmas", "France")
    Feliz.Regards(" Julio")

  }
  def typesPractice() : Unit = {

    print("=" * 50)
    print("Types Practice")
    print("=" * 50)
    print("\n")

    val phrase: String = " New Phrase"
    val int_practice: Int = 123
    val char_prractice: Char = 'z'
    val boolean_practice: Boolean = true
    val float_practice: Float = 3.5623f
    val double_practice: Double = 3.44
    val short_practice: Short= 4.55.toShort

    val lista: List[Any] = List(
      phrase, int_practice,char_prractice, boolean_practice,
      () => "an anonymous function returning a string",
      float_practice, double_practice, short_practice

    )

    lista.foreach(element => println(element))

  }

  def castTypes(): Unit = {

    print("=" * 50)
    print("Type Cast")
    print("=" * 50)
    print("\n")

    val exeInt = 1213254654
    println(exeInt)
    val exeLong: Long = exeInt.toLong
    println(exeLong)
    val exeFloat: Float = exeLong.toFloat
    println(exeFloat)

    val exeDouble: Double = exeFloat.toDouble
    println(exeDouble)

    val exechar: Char = 'z'
    val exeInte: Int = exechar.toInt
    println(exechar)
    println(exeInte)


  }

  def suma(n1: Option[Double], n2: Option[Double]): Unit = {
    println("=" * 50)
    println("Option practice")
    println("=" * 50)

    (n1, n2) match {
      case (None, _) =>
        println("first param is empty")
      case (_, None) =>
        println("second param is empty")
      case (Some(a), Some(b)) =>
        println(a + b)
    }
  }

}
