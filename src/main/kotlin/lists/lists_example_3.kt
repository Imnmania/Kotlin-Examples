fun main() {
    // * filter list and add it to a mutable list
    val approved = mutableListOf<String>("Daniele", "Paul")
    val names = listOf<String>("Donn", "Bob", "Jane", "Jenny")

//    names.filterTo(approved, { it.lowercase().contains('o') })
    names.filterNotTo(approved, { it.lowercase().contains('o') })
    println(approved)
}