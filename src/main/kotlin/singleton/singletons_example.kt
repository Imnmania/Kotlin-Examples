fun main() {
    println(FavoriteFood.name)
    FavoriteFood.name = "Coffee"
    println(FavoriteFood.name)

    val A = FavoriteFood
    println(A.name)

    doStuff()
    println(A.name)

    FavoriteFood.ingredients.add("Salt")
    println(A.ingredients.first())
    println(A.ingredients.size)

    print(A === FavoriteFood)
}

fun doStuff() {
    FavoriteFood.name = "Tea"
}

// * In kotlin, we declare singleton by replacing "class" with "object" keyword
object FavoriteFood {

    var name: String = "Unknown"
    val ingredients = mutableListOf<String>()

}