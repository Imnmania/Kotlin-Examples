fun main () {
    // * mutable lists
    val items = mutableListOf<Int>(1, 2, 3, 4, 5)
    items.forEach { print("$it ") }
    println()

    items.add(6)
    items.forEach { print("$it ") }
    println()

    items.removeAt(0)
    items.forEach { print("$it ") }
    println()

    items.remove(5)
    items.forEach { print("$it ") }
    println()

    println(items[0])
}