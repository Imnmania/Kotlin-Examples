package type_alias

/*
* typealias in kotlin is same as typedef in dart
* */

typealias AuthToken = String

fun main() {
    val user = User("Donn", "#$K@J#H$J#H$*(E&U*(#&!@!")
    Order(user.authToken)
}

//data class AuthToken(val token: String)

data class User(val userName: String, val authToken: AuthToken)

data class Account(val authToken: AuthToken)

data class Order(val authToken: AuthToken)