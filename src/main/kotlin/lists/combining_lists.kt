fun main() {
    val people = listOf(
        Person3("Niloy1"),
        Person3("Niloy2"),
        Person3("Niloy3"),
        Person3("Niloy4"),
    )

    val morePeople = listOf(
        Person3("Biswas1"),
        Person3("Biswas2"),
        Person3("Biswas3"),
        Person3("Biswas4"),
        Person3("Niloy1"),
        Person3("Niloy1"),
    )

    //* unique values for two lists merged
    val finalPeople = people.union(morePeople)
    println(finalPeople)
}