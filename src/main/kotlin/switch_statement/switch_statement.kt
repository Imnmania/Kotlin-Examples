package switch_statement

import constants.User

fun main() {
    val user = User(firstName = "Dan", lastName = "Biswas")

    // * In kotlin, switch case is used with "when" keyword
    when(user.firstName) {
        "Niloy" -> {
            println("This is Niloy")
        }
        else -> {
            println("Name not found")
        }
    }

    // * Another way
    when {
        user.firstName == "Niloy" && user.lastName == "Biswas" -> println("This is Niloy Biswas")
        user.firstName == "Dan" -> println("This is Dan")
        else -> println("Name not found!")
    }
}