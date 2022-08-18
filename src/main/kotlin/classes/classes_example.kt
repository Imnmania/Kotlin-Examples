package classes

fun main() {
    var user = User()
    user.firstName = "Niloy"
    user.lastName = "Biswas"

    var friend = User()
    friend.firstName = "Jane"
    friend.lastName = "Doe"

    println(user.toString())
    println(friend.toString())

    user.printFullName()
    friend.printFullName()

    user.printWithPrefix("Mr.")

    friend.updateName("Bob")
    friend.printFullName()

}

