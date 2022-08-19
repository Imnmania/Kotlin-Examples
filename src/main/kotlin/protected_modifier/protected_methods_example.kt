package protected_modifier

fun main() {
    val p = Person4("Foo", 23)
    println(p)

    val c = Chef2("Bob", 54, "Vodka")
    println(c)

//    p.printMyFavoriteFood()
//    c.printMyFavoriteFood()
    c.setMyFavoriteFood("Gin")
    println(c)
}


open class Person4(var name: String, var age: Int) {
    protected var favoriteFood: String = "unknown"
    // setFavoriteFood( value: String )
    // getFavoriteFood() : String

    protected fun printMyFavoriteFood() {
        println(favoriteFood)
    }

    override fun toString(): String {
        return "Person3 (name = $name, age = $age)"
    }
}

open class Chef2(name: String, age: Int, var favFood: String) : Person4(name, age) {
    init {
        favoriteFood = favFood
    }

    fun setMyFavoriteFood(food: String) {
        favFood = food
        favoriteFood = favFood
        printMyFavoriteFood()
    }

    override fun toString(): String {
        return "Chef (name = $name, age = $age, favFood = $favFood)"
    }
}

class SousChef(name: String, age: Int, favFood: String) : Chef2(name, age, favFood) {
    init {
        printMyFavoriteFood()
    }
}