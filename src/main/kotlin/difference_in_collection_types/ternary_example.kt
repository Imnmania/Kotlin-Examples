package difference_in_collection_types

fun main() {

    // List
    val list = listOf("Donn", "Niloy", "Felker", "Biswas")
    println(list)

    // Set
    val set = setOf("Donn", "Niloy", "Felker", "Biswas", "Donn")
    println(set)

    // Map: Key value pairs
    val map = mapOf("Donn" to "Felker", "Niloy" to "Biswas", "Evelyn" to "Smith")
    println(map)

    // Sequence: performance
    val sequence = sequenceOf(1, 2, 3, 4, 5)
    println(sequence)

}