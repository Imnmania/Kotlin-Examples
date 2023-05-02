package late_init

fun main() {
    var AB = User(firstName = "Donn", lastName = "Felker")
    AB.favoriteCity = "Tokyo"
    println(AB.favoriteCity)
}

class User (var firstName: String, var lastName: String) {

    lateinit var favoriteCity: String

    override fun toString(): String {
        return "late_init.User ( First Name => $firstName, Last Name => $lastName )"
    }
}

