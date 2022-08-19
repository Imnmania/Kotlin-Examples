package classes_data

fun main() {
    val person = Person2("Niloy", "Biswas", 27)

    val sibling1 = person.copy()
    println(sibling1)
    println(person == sibling1)

    val sibling2 = person.copy(firstName = "Sam")
    println(sibling2)
    println(person == sibling2)

    val order = Order(amount = 20.0, customer = sibling2)
    println(order)

    val order2 = order.copy(amount = 200.0)
    println(order2)
}

data class Person2(
    val firstName: String,
    val lastName: String,
    val age: Int
)

data class Order(
    val amount: Double,
    val customer: Person2
)
