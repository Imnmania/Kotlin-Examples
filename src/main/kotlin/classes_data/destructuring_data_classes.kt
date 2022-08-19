package classes_data

fun main() {
    val person = Person("Niloy", "Biswas", 27)

    // names don't matter
    val (firstName, lastName, age) = person
    println("$firstName $lastName $age")
}

