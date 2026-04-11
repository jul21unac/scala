case class Discotec(music: String)

case class phone(num_ber: String, owner: String, first_phrase: String)

case class restaurant(name: String, cuisine: String, rating: Double)

object CcRun {
    def main(args: Array[String]): Unit = {
        
        val discotec = Discotec("salsa")
        val discotec3 = Discotec("Rock")
        println(discotec.music) 
        println(discotec3.music)

        val phone1 = phone("1234567890", "Alice", "Hello, this is Alice!")
        val phone2 = phone("1234567890", "Alice", "Hello, this is Alice!")

        println(phone1.num_ber == phone2.num_ber)

        val phone3 =  phone1.copy( owner ="David", first_phrase = phone1.owner)  

        println(phone3.owner)
        println(phone3.first_phrase)  
        println(phone3.num_ber)

        val restou = restaurant("Gaitero", "Asturian", 11.5)
        println(restou.name)
        println(restou.cuisine)
        println(restou.rating)
        

    }
}

