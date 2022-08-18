fun main() {
    var name: String? = "Niloy"
    name = null

    println(name)

    var person: Person = Person("Foo")
    println(person)

    var person2: Person? = Person("Bar")
//    person2 = null
    println(person2)
    println(person2?.name?.length)

    // safe call
    if (person2?.name != null) {
        println(person2.name)
    }

    println(person2?.name?.substring(0,1))

    // short circuit ( elvis operator ?: )
    var lastName: String? = "Felker"
    lastName = null
    var length: Int = lastName?.length ?: 0 // similar to ?? in dart
    println(length)
}