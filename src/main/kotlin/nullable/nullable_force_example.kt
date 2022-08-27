package nullable

/*
* Only use this when you are absolutely sure that its not gonna be null
* */

import Person

fun main() {
    var name: String? = "Donn"
    var length = name!!.length

    println(length)

//    val person: Person? = Person("Kon")
//    println(person!!.name)

    //* requireNotNull and checkNotNull are the same
    val person: Person? = null
    val nameFromApi = requireNotNull(person, {"The name should not be null !!!"}).name
    print(nameFromApi)
}