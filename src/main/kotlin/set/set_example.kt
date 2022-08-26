fun main() {
    // * Immutable set
    val names = setOf<String>("Donn", "Niloy", "Felker", "Biswas", "Donn", "Niloy")
    println(names)

    // * Mutable set
    val names2 = mutableSetOf<String>("Donn", "Niloy", "Felker", "Biswas")
    println(names2)
    names2.add("Hee hee")
    println(names2)
    names2.add("Hee hee")
    println(names2)

    // * Set of objects
    val people = setOf<Person2>(
        Person2("Donn"),
        Person2("Donn"),
        Person2("Donn"),
        Person2("Niloy"),
    )

    print(people)

}

data class Person2(val name: String)