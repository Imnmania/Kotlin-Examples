fun main() {
    printUserInfo("Niloy")
    printUserInfo("John Doe", 12)
    printUserInfo("Jane Dough", 30, "Red")
}

fun printUserInfo(name: String, age: Int? = null, favoriteColor: String? = null) {
    println("Name => $name, Age => $age, Favcolor => $favoriteColor")
}

// * Overloading
//fun printUserInfo(name: String, age: Int) {
//    println("Name => $name, Age => $age")
//}
//
//fun printUserInfo(name: String, age: Int, favoriteColor: String) {
//    println("Name => $name, Age => $age, Favcolor => $favoriteColor")
//}