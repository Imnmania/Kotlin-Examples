package ternary_operator

/*
* Ternary operator does not exist in kotlin
* */

fun main() {
    var name: String? = null
    val length = if (name != null) name.length else 0
    println(length)
}