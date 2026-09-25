package com.football

object FootbalData {

  val DefensePlayers: List[(String, String)] = List(
    // FC BARCELONA
    ("Ronald Araújo", "FC Barcelona"),
    ("Jules Koundé", "FC Barcelona"),
    ("Pau Cubarsí", "FC Barcelona"),
    ("Alejandro Balde", "FC Barcelona"),
    ("Eric García", "FC Barcelona"),
    ("Andreas Christensen", "FC Barcelona"),
    ("Gerard Martín", "FC Barcelona"),
    ("Héctor Fort", "FC Barcelona"),
    ("Joao Cancelo", "FC Barcelona"),

    // REAL MADRID
    ("Antonio Rüdiger", "Real Madrid"),
    ("Éder Militão", "Real Madrid"),
    ("Dani Carvajal", "Real Madrid"),
    ("Ferland Mendy", "Real Madrid"),
    ("David Alaba", "Real Madrid"),

    // ATLÉTICO DE MADRID
    ("Marcos Llorente", "Atlético de Madrid"),
    ("Marc Pubill", "Atlético de Madrid"),
    ("José María Giménez", "Atlético de Madrid"),
    ("Robin Le Normand", "Atlético de Madrid"),
    ("Cuti Romero", "Atlético de Madrid"),
    ("Dávid Hancko", "Atlético de Madrid"),
    ("Alejandro Grimaldo", "Atlético de Madrid"),

    // ATHLETIC CLUB
    ("Dani Vivian", "Athletic Club"),
    ("Yeray Álvarez", "Athletic Club"),
    ("Aymeric Laporte", "Athletic Club"),
    ("Yuri Berchiche", "Athletic Club"),
    ("Jesús Areso", "Athletic Club"),
    ("Aitor Paredes", "Athletic Club"),
    ("Andoni Gorosabel", "Athletic Club"),

    // REAL SOCIEDAD
    ("Jon Aramburu", "Real Sociedad"),
    ("Aritz Elustondo", "Real Sociedad"),
    ("Igor Zubeldia", "Real Sociedad"),
    ("Javi Galán", "Real Sociedad"),

    // REAL BETIS
    ("Marc Bartra", "Real Betis"),
    ("Fran García", "Real Betis"),
    ("Héctor Bellerín", "Real Betis"),
    ("Junior Firpo", "Real Betis"),
    ("Natan", "Real Betis"),
    ("Diego Llorente", "Real Betis"),

    // SEVILLA FC
    ("Loïc Badé", "Sevilla FC"),
    ("Nemanja Gudelj", "Sevilla FC"),
    ("Kike Salas", "Sevilla FC"),
    ("José Ángel Carmona", "Sevilla FC"),
    ("Adrià Pedrosa", "Sevilla FC"),

    // VILLARREAL CF
    ("Kiko Femenía", "Villarreal CF"),
    ("Raúl Albiol", "Villarreal CF"),
    ("Eric Bailly", "Villarreal CF"),

    // VALENCIA CF
    ("Cristhian Mosquera", "Valencia CF"),
    ("José Gayà", "Valencia CF"),
    ("Mouctar Diakhaby", "Valencia CF"),

    // GETAFE CF
    ("Omar Alderete", "Getafe CF"),
    ("Juan Iglesias", "Getafe CF"),
    ("Diego Rico", "Getafe CF"),
    ("Domingos Duarte", "Getafe CF")
  )

  val attack: List[(String, String)] = List(
    // REAL MADRID
    ("Kylian Mbappé", "Real Madrid"),
    ("Vinícius Júnior", "Real Madrid"),
    ("Jude Bellingham", "Real Madrid"),
    ("Endrick", "Real Madrid"),
    ("Carlos Espí", "Real Madrid"),
    ("Yan Diomande", "Real Madrid"),

    // FC BARCELONA
    ("Gabriel Jesus", "FC Barcelona"),
    ("Lamine Yamal", "FC Barcelona"),
    ("Raphinha", "FC Barcelona"),
    ("Ferran Torres", "FC Barcelona"),
    ("Anthony Gordon", "FC Barcelona"),
    ("Karim Adeyemi", "FC Barcelona"),

    // ATLÉTICO DE MADRID
    ("Julián Álvarez", "Atlético de Madrid"),
    ("Alexander Sørloth", "Atlético de Madrid"),
    ("Antoine Griezmann", "Atlético de Madrid"),

    // OTROS EQUIPOS DESTACADOS
    (
      "Roberto Fernández",
      "RCD Espanyol"
    ),
    ("Vedat Muriqi", "RCD Mallorca"),
    ("Ante Budimir", "CA Osasuna"),
    ("Borja Iglesias", "RC Celta"),
    ("Gerard Moreno", "Villarreal CF"),
    ("Nicolas Pépé", "Villarreal CF"),
    ("Pierre-Emerick Aubameyang", "Deportivo de A Coruña"),
    ("Hugo Duro", "Valencia CF"),
    ("Iago Aspas", "RC Celta"),
    ("Toni Martínez", "Deportivo Alavés"),
    ("Nico Williams", "Athletic Club"),
    ("Gorka Guruzeta", "Athletic Club"),
    ("Enes Ünal", "Getafe CF"),
    ("Iván Azón", "Getafe CF"),
    ("Javi Puado", "RCD Espanyol")
  )

  val teams: List[(String)] = List(
    "Alavés",
    "Athletic Club",
    "Atlético de Madrid",
    "FC Barcelona",
    "RC Celta",
    "Deportivo de A Coruña",
    "Elche",
    "RCD Espanyol",
    "Getafe CF",
    "Levante",
    "Málaga",
    "CA Osasuna",
    "Racing de Santander",
    "Rayo Vallecano",
    "Real Betis",
    "Real Madrid",
    "Real Sociedad",
    "Sevilla FC",
    "Valencia CF",
    "Villarreal CF",
    "RCD Mallorca"
  )

  val goalkeeper: List[(String, String)] = List(
    ("Thibaut Courtois", "Real Madrid"),
    ("Andriy Lunin", "Real Madrid"),
    ("Joan García", "FC Barcelona"),
    ("Wojciech Szczęsny", "FC Barcelona"),
    ("Jan Oblak", "Atlético de Madrid"),
    ("Juan Musso", "Atlético de Madrid"),
    ("Unai Simón", "Athletic Club"),
    ("Julen Agirrezabala", "Athletic Club"),
    ("Álex Remiro", "Real Sociedad"),
    ("Unai Marrero", "Real Sociedad"),
    ("Álvaro Vallés", "Real Betis"),
    ("Rui Silva", "Real Betis"),
    ("Odysseas Vlachodimos", "Sevilla FC"),
    ("Ørjan Nyland", "Sevilla FC"),
    ("Fran González", "Sevilla FC"),
    ("Antonio Sivera", "Alavés"),
    ("Jesús Owono", "Alavés"),
    ("David Soria", "Getafe CF"),
    ("Juanmi Latasa", "Getafe CF"),
    ("Sergio Herrera", "CA Osasuna"),
    ("Aitor Fernández", "CA Osasuna"),
    ("Luiz Júnior", "Villarreal CF"),
    ("Péter Gulácsi", "Villarreal CF"),
    ("Arnau Tenas", "Villarreal CF"),
    ("Diego Conde", "Villarreal CF"),
    ("Andrei Radu", "RC Celta"),
    ("Ionut Radu", "RC Celta"),
    ("Vicente Guaita", "RC Celta"),
    ("Leo Román", "RCD Mallorca"),
    ("Marko Dmitrović", "Leganés"),
    ("Juan Soriano", "Leganés"),
    ("Mathew Ryan", "Levante"),
    ("Andrés Fernández", "Levante"),
    ("Dani Cárdenas", "Rayo Vallecano"),
    ("Augusto Batalla", "Rayo Vallecano"),
    ("Álex Padilla", "Deportivo de A Coruña"),
    ("Germán Parreño", "Deportivo de A Coruña"),
    ("Álvaro Fernández", "Elche"),
    ("Matías Dituro", "Elche"),
    ("Fernando Pacheco", "RCD Espanyol"),
    ("Marko Dmitrović", "RCD Espanyol"),
    ("Julen Agirrezabala", "Valencia CF"),
    ("Jaume Doménech", "Valencia CF"),
    ("Alfonso Herrero", "Málaga"),
    ("Carlos López", "Málaga"),
    ("Jokin Ezkieta", "Racing de Santander"),
    ("Luis Fernández", "Racing de Santander")
  )

  val midFieldPlayer: List[(String, String)] = List(
    // ALAVÉS
    ("Antonio Blanco", "Alavés"),
    ("Guevara", "Alavés"),
    ("Selu Diallo", "Alavés"),
    ("Mikel Rodríguez", "Alavés"),
    ("Denis Suárez", "Alavés"),
    ("Carles Aleñá", "Alavés"),
    ("Pablo Ibáñez", "Alavés"),
    ("Protesoni", "Alavés"),
    ("Izei Hernández", "Alavés"),

    // ATHLETIC CLUB
    ("Galarreta", "Athletic Club"),
    ("Jauregizar", "Athletic Club"),
    ("Sancet", "Athletic Club"),
    ("Berenguer", "Athletic Club"),
    ("Prados", "Athletic Club"),
    ("Peio Canales", "Athletic Club"),
    ("Rego", "Athletic Club"),
    ("Selton", "Athletic Club"),
    ("Gerenebarrena", "Athletic Club"),

    // ATLÉTICO DE MADRID
    ("Koke", "Atlético de Madrid"),
    ("Johnny Cardoso", "Atlético de Madrid"),
    ("Hjulmand", "Atlético de Madrid"),
    ("Rodrigo Mendoza", "Atlético de Madrid"),
    ("Pablo Barrios", "Atlético de Madrid"),
    ("Obed Vargas", "Atlético de Madrid"),
    ("Kang-in Lee", "Atlético de Madrid"),
    ("Álex Baena", "Atlético de Madrid"),

    // BARCELONA
    ("De Jong", "FC Barcelona"),
    ("Marc Bernal", "FC Barcelona"),
    ("Gavi", "FC Barcelona"),
    ("Pedri", "FC Barcelona"),
    ("Fermín", "FC Barcelona"),
    ("Dani Olmo", "FC Barcelona"),
    ("Rodri", "FC Barcelona"),
    ("Brian Fariñas", "FC Barcelona"),

    // BETIS
    ("Facundo Bernal", "Real Betis"),
    ("Marc Roca", "Real Betis"),
    ("Fidalgo", "Real Betis"),
    ("Pablo Fornals", "Real Betis"),
    ("Isco", "Real Betis"),
    ("Lo Celso", "Real Betis"),
    ("Deossa", "Real Betis"),
    ("Riquelme", "Real Betis"),
    ("Dani Ceballos", "Real Betis"),

    // CELTA
    ("Ilaix Moriba", "RC Celta"),
    ("Miguel Román", "RC Celta"),
    ("Aleix Febas", "RC Celta"),
    ("Hugo Álvarez", "RC Celta"),
    ("Bajcetic", "RC Celta"),

    // DEPORTIVO
    ("Amatucci", "Deportivo de A Coruña"),
    ("Riki Rodríguez", "Deportivo de A Coruña"),
    ("Villares", "Deportivo de A Coruña"),
    ("Gijselhart", "Deportivo de A Coruña"),
    ("Asp Jensen", "Deportivo de A Coruña"),
    ("Mario Soriano", "Deportivo de A Coruña"),
    ("Jairo Noriega", "Deportivo de A Coruña"),
    ("Marc Casadó", "Deportivo de A Coruña"),

    // ELCHE
    ("Marc Aguado", "Elche"),
    ("Gonzalo Villar", "Elche"),
    ("Martim Neto", "Elche"),
    ("Fede Redondo", "Elche"),
    ("Facundo Buonanotte", "Elche"),
    ("Morcillo", "Elche"),
    ("Edgar Alcañiz", "Elche"),
    ("Germán Valera", "Elche"),
    ("Lemar", "Elche"),

    // ESPANYOL
    ("Urko González", "RCD Espanyol"),
    ("Moscardó", "RCD Espanyol"),
    ("Edu Expósito", "RCD Espanyol"),
    ("Pol Lozano", "RCD Espanyol"),
    ("Bauzà", "RCD Espanyol"),
    ("Javi Hernández", "RCD Espanyol"),

    // GETAFE
    ("Mario Martín", "Getafe CF"),
    ("Terrats", "Getafe CF"),
    ("Javi Muñoz", "Getafe CF"),
    ("Macalou", "Getafe CF"),
    ("Adrián Riquelme", "Getafe CF"),
    ("Risco", "Getafe CF"),
    ("Mangala", "Getafe CF"),
    ("Francho Serrano", "Getafe CF"),
    ("Nemanja Gudelj", "Getafe CF"),

    // LEVANTE
    ("Hugo Sotelo", "Levante"),
    ("Olasagasti", "Levante"),
    ("Dani Requena", "Levante"),
    ("Bardeli", "Levante"),
    ("Oriol Rey", "Levante"),
    ("Carlos Álvarez", "Levante"),
    ("Thiago Fernández", "Levante"),
    ("Axel Tape", "Levante"),

    // MÁLAGA
    ("Izan Merino", "Málaga"),
    ("Ramón", "Málaga"),
    ("Carlos Dotor", "Málaga"),
    ("Rafa Rodríguez", "Málaga"),
    ("Dani Lorenzo", "Málaga"),
    ("Aarón Ochoa", "Málaga"),
    ("Juan Cruz", "Málaga"),
    ("Pablo Martínez", "Málaga"),
    ("Cajuste", "Málaga"),

    // OSASUNA
    ("Moncayola", "CA Osasuna"),
    ("Lucas Torró", "CA Osasuna"),
    ("Iker Muñoz", "CA Osasuna"),
    ("Aimar Oroz", "CA Osasuna"),
    ("Moi Gómez", "CA Osasuna"),
    ("Rubén García", "CA Osasuna"),
    ("Osambela", "CA Osasuna"),
    ("Echegoyen", "CA Osasuna"),

    // RACING DE SANTANDER
    ("Iñigo Sainz", "Racing de Santander"),
    ("Maguette", "Racing de Santander"),
    ("Sergio Canales", "Racing de Santander"),
    ("Iván Martín", "Racing de Santander"),
    ("Matteo Prati", "Racing de Santander"),
    ("André Almeida", "Racing de Santander"),

    // RAYO VALLECANO
    ("Pathé Ciss", "Rayo Vallecano"),
    ("Pedro Díaz", "Rayo Vallecano"),
    ("Unai López", "Rayo Vallecano"),
    ("Óscar Valentín", "Rayo Vallecano"),
    ("Isi", "Rayo Vallecano"),
    ("Gnangoro Bouare", "Rayo Vallecano"),
    ("Belaid", "Rayo Vallecano"),

    // REAL MADRID
    ("Valverde", "Real Madrid"),
    ("Tchouaméni", "Real Madrid"),
    ("Camavinga", "Real Madrid"),
    ("Bellingham", "Real Madrid"),
    ("Bernardo Silva", "Real Madrid"),
    ("Arda Güler", "Real Madrid"),
    ("Thiago Pitarch", "Real Madrid"),

    // REAL SOCIEDAD
    ("Gorrotxategi", "Real Sociedad"),
    ("Yangel Herrera", "Real Sociedad"),
    ("Turrientes", "Real Sociedad"),
    ("Pablo Marín", "Real Sociedad"),
    ("Carlos Soler", "Real Sociedad"),
    ("Zakharyan", "Real Sociedad"),
    ("Sucic", "Real Sociedad"),

    // SEVILLA
    ("Guridi", "Sevilla FC"),
    ("Agoumé", "Sevilla FC"),
    ("Peque", "Sevilla FC"),
    ("Manu Bueno", "Sevilla FC"),
    ("Oso", "Sevilla FC"),
    ("Nico Guillén", "Sevilla FC"),
    ("Kochorashvili", "Sevilla FC"),
    ("Fofana", "Sevilla FC"),

    // VALENCIA
    ("Guido Rodríguez", "Valencia CF"),
    ("Sato", "Valencia CF"),
    ("Javi Guerra", "Valencia CF"),
    ("Pepelu", "Valencia CF"),
    ("Ugrinic", "Valencia CF"),
    ("Dieng", "Valencia CF"),
    ("Harvey Elliot", "Valencia CF"),

    // VILLARREAL
    ("Santi Comesaña", "Villarreal CF"),
    ("Pape Gueye", "Villarreal CF"),
    ("Moleiro", "Villarreal CF"),
    ("Diattá", "Villarreal CF"),
    ("Maciá", "Villarreal CF"),
    ("Thiam", "Villarreal CF"),
    ("Nathan Saliba", "Villarreal CF")
  )

}
