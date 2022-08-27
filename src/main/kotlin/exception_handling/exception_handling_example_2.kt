package exception_handling

import exceptions.Person4
import java.lang.Exception

fun main() {
    val p = Person4("Kon", 3)

    try {
        checkAge(p)
        println("Done")
    } catch (ex: Exception) {
        println("handled")
    } finally {
        // do some clean-ups
        println("finally")
    }

    println("After try/catch")
}

private fun checkAge(p: Person4) {
    if (p.age < 18) {
        throw Exception("BOOOM!!!")
    }
}