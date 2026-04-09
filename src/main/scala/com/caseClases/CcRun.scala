case class Discotec(music: String)


object CcRun {
    def main(args: Array[String]): Unit = {
        
        val discotec = Discotec("salsa")
        val discotec3 = Discotec("Rock")
        println(discotec.music) 
        println(discotec3.music)

    }
}

