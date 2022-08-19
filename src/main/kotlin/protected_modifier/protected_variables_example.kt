package protected_modifier


fun main() {
    val p = Person3("Foo", 23)
    println(p)

    val c = Chef("Bob", 54, "Vodka")
    println(c)

    c.setMyFavoriteFood("Gin")
    c.printMyFavoriteFood()

    p.printMyFavoriteFood()
}


open class Person3(var name: String, var age: Int) {
    protected var favoriteFood: String = "unknown"
    // setFavoriteFood( value: String )
    // getFavoriteFood() : String

    fun printMyFavoriteFood() {
        println(favoriteFood)
    }

    override fun toString(): String {
        return "Person3 (name = $name, age = $age)"
    }
}

class Chef(name: String, age: Int, var favFood: String) : Person3(name, age) {
    init {
        favoriteFood = favFood
    }

    fun setMyFavoriteFood(food: String) {
        favFood = food
        favoriteFood = favFood
    }

    override fun toString(): String {
        return "Chef (name = $name, age = $age, favFood = $favFood)"
    }
}
