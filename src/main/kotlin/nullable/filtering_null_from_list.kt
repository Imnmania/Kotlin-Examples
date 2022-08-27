package nullable

fun main() {
    val names = listOf("Donn", "John", "Mike", null, "Dave", null, "Niloy")

    val namesThatAreNotNull = names.filterNotNull()
    print(namesThatAreNotNull)
}