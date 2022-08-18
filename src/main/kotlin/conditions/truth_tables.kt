package conditions

fun main() {
    val myAge = 32
    val yourAge = 32

    val myName = "Niloy"
    val yourName = "Tushar"

    if ((myAge != yourAge) && (myName != yourName)) {
        println("Both items are true")
    } else {
        println("One or more items are false")
    }
}