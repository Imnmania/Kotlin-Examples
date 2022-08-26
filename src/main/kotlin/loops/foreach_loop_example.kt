fun main() {
    val people = listOf(
        Person3("Donn"),
        Person3("Jake"),
        Person3("Janet"),
        Person3("Michael"),
    )

    for (i in people) {
        println(i)
    }

    people.forEach { println(it) }

    people.map { it.name }
        .map { it.uppercase() }
        .map { it.reversed() }
        .forEach { println(it) }

//    print(new)

}