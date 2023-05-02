import late_init.User

fun main() {
    val items = arrayOf(1,2,3,4,5)
    items.forEach { println(it) }
    items.forEach { value -> println(value) }
    items.forEach { value -> {
        println(value)
    } }

    val items2 = doubleArrayOf(1.0, 2.0, 3.0, 4.0)
    items2.forEach { print( "$it " ) }

    val items3 = arrayOf<User>(
        User("a", "b"),
        User("c", "d"),
        User("e", "f"),
    )
    items3.forEach { println(it) }

    val items3_new = items3.plus(User("John", "Doe"))
    items3_new.forEach { println(it) }

    items3_new.set(0, User("Foo", "Bar"))
    items3_new.forEach { println(it) }

}