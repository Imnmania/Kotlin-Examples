package classes_data

fun main() {
    val p1 = Person("Niloy", "Biswas", 27)
    val p2 = Person("Niloy", "Biswas", 27)

    println(p1 == p2)
    println(p1 === p2)
    println(p1)
    println(p2)
    println(p1.nameLength())
    println(p1.fullName())
}

/*
* data class creates:
* equals
* hashcodes
* toString
* */
data class Person(val firstName: String, val lastName: String, val age: Int) {
    fun fullName(): String {
        return "$firstName $lastName"
    }

    fun nameLength(): Int {
        return firstName.length
    }
}
