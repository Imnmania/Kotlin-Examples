package exceptions

import java.lang.Exception
import java.lang.IllegalArgumentException

fun main() {
    val p = Person4("Don", 13)
    if (p.age < 18) {
//        throw Exception("late_init.User is not old enough")
        throw IllegalArgumentException("late_init.User is not old enough")
    }
}

data class Person4(val name: String, val age: Int)