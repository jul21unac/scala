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
    "Deportivo",
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
    "Villarreal CF"
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
    ("Álex Padilla", "Deportivo"),
    ("Germán Parreño", "Deportivo"),
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

}
