package constants

import Constants

fun main() {
    var A = User("Jon", "Doe")
    println(A.MAX_AGE)
    println(User.MAX_HEIGHT)

    println(Constants.MAX_AGE)
    println(Constants.MAX_HEIGHT)
}

class User(var firstName: String, var lastName: String) {

    val MAX_AGE = 20

    companion object {
        const val MAX_HEIGHT = 6
    }

    override fun toString(): String {
        return "late_init.User ( First Name => $firstName, Last Name => $lastName )"
    }
}