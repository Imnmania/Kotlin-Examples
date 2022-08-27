package difference_in_collection_types

fun main() {

    // List
    val list = listOf("Donn", "Niloy", "Felker", "Biswas")

    // Set
    val set = setOf("Donn", "Niloy", "Felker", "Biswas", "Donn")

    // Map: Key value pairs
    val map = mapOf("Donn" to "Felker", "Niloy" to "Biswas", "Evelyn" to "Smith")

    // Sequence: performance
    val sequence = sequenceOf(1, 2, 3, 4, 5)

}