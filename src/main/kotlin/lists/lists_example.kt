fun main() {
    // * immutable list
    val items = listOf(1, 2, 3, 4, 5)
    items.forEach( { println(it) } )
    println(items)

    val users = listOf<User>(
        User("Niloy", "Biswas"),
        User(firstName = "John", lastName = "Doe")
    )
    users.forEach( { println(it) } )

    val name: String? = "null"
    val stuff = if (name == null) emptyList<String>() else listOf<String>(name)
    println(stuff)
}