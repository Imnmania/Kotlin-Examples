package type_alias

/*
* typealias in kotlin is same as typedef in dart
* */

typealias AuthToken = String

fun main() {
    val user = User("Donn", "asdasrejhrjkw34564545jhj")
    val order = Order(user.authToken)
    print(order)

}

//data class AuthToken(val token: String)

data class User(val userName: String, val authToken: AuthToken)

data class Account(val authToken: AuthToken)

data class Order(val authToken: AuthToken)