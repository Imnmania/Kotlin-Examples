fun main() {
    val names = listOf<String>("Donn", "Bob", "Jane", "Jenny", "Niloy", "Dang")
//    val filtered = names.filter { it != "Donn" }
    val filtered = names.filter { it.lowercase().contains('a') }
    println(filtered)

    val ages = listOf<Int>(23, 33, 12, 8, 17, 19, 99)
//    val adults = ages.filter { it >= 18 }
    val adults = ages.filter(::isAdult)
    print(adults)
}

fun isAdult(age: Int) : Boolean {
    return age >= 18
}