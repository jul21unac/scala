import java.time.format.{DateTimeFormatter, FormatStyle}
import java.time.LocalDate
import java.util.Locale._

object FrenchDate {
  def main(args: Array[String]): Unit = {
    val now = LocalDate.now
    val df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(FRANCE)
    println(df.format(now))

    // valores
    val x = 1+1
    println(x)
    val y = 1.to(10)
    println(y)
    val z = "Hello, " ++ "Scala!"
    println(z)
    //variables
    var suma = 10+1
    suma = suma + x
    println(suma)

    //bloques
    println({
      val x=1+2
      x+5
    })

    val plusone = (x: Int) => x+1
    println(plusone(89))

    val noParameter= () => "no parameters"
    println(noParameter())

    println( substrac(110,10))
    println(substhendivide(110,10)(10))

  }
  def substrac(x: Int, y: Int): Int =  x - y

  def substhendivide(x: Int, y: Int)(Divide: Int): Float = (x-y)/Divide


}
