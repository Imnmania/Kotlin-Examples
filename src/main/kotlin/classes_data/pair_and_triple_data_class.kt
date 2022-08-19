package classes_data

fun main() {
    // * Way 1 (Pair)
    val pair = Pair("foo", "bar")
    println(pair.first)
    println(pair.second)

    // * Way 2 (Pair)
    val pair2 = "boo" to "car"
    println(pair2.first)
    println(pair2.second)

    val triple = Triple("foo", "bar", "baz")
    println("----------------------------")
    println(triple.first)
    println(triple.second)
    println(triple.third)
}