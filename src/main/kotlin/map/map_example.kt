fun main() {

    val items = listOf("Donn Felker", "John Doe", "Jane Doe", "Peter Parker", "Tony Stark")
//    val abbreviations = items.map { it.substring(0, 3).uppercase() }

    val abbreviations = items.map { it.substring(0, 3).uppercase() }
        .filter { it.lowercase().contains('o') }
        .reversed()

    println(abbreviations)


    val people = listOf<Person>(
        Person("Donn"),
        Person("Jake"),
        Person("King"),
        Person("Joker")
    )

    val peopleResult = people.map { it.name }.map { it.length }
    println(peopleResult)
}