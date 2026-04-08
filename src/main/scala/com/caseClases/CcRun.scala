case class Discotec(music: String)


object CcRun {
    def main(args: Array[String]): Unit = {
        
        val discotec = Discotec("salsa")
        println(discotec.music)
    }
}

