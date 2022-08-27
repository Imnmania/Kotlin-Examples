package extensions

fun main() {
    val name = "Don Felker"
    println(name.initials())

    println(13.isAdult())

    val p = Person5("Niloy", "Biswas", 100)
    print(p.fullName())
}

fun String.initials(): String {
    val values = this.split(' ')
    val firstInitial = values[0].substring(0,1)
    val secondInitial = values[1].substring(0,1)
    return "$firstInitial$secondInitial"
}

fun Int.isAdult(): Boolean = this > 18

fun Person5.fullName() : String {
    return "${this.firstName} ${this.lastName}"
}

class Person5(val firstName: String, val lastName: String, val age: Int)