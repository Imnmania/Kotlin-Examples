package any

import Person

/*
* Any is similar to dynamic type in Dart
* */

fun main() {

    val age: Any = 32
    if (age is String) {
        println("is Any!")
    } else {
        println("not Any!")
    }

    val p: Any = Person("Hello")
    println(p.javaClass.name)
    println(p::class)
//    println(age.javaClass.name)
//    println(age::class)

    val stuff = getStuff("4")
    println(stuff)
    val casted : Person = stuff as Person
    println(casted.name)

    // safe cast ( as? returns null if unable to cast )
    val casted2 = stuff as? Person
    println(casted2?.name)

}

fun getStuff(value: String) : Any {
    return when(value) {
        "1" -> 1
        "2" -> "Hello"
        "3" -> true
        "4" -> Person("Donn")
        else -> "N/A"
    }
}