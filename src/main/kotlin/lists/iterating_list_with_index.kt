fun main() {

    val people = listOf(
        Person3("Niloy1"),
        Person3("Niloy2"),
        Person3("Niloy3"),
        Person3("Niloy4"),
    )

    people.forEachIndexed { index, person3 ->
        println("Index: $index, Person: $person3")
//        println(people[index].name)
    }

}