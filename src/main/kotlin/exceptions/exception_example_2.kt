package exceptions

import java.lang.IllegalArgumentException

/*
* Custom Exceptions
* */

fun main() {
    val p = Person4("Don", 13)
    if (p.age < 18) {
        throw InvalidAgeException(p.age, "User is not old enough")
    }
}

class InvalidAgeException (val age: Int, message: String) : IllegalArgumentException("Invalid age: $age, $message")