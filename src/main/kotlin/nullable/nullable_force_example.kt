package nullable

/*
* Only use this when you are absolutely sure that its not gonna be null
* */

import Person

fun main() {
    var name: String? = "Donn"
    var length = name!!.length

    println(length)

    val person: Person? = Person("Kon")
    println(person!!.name)
}