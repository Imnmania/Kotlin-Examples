/*
* Multiple arguments or varargs
* */

fun main() {
    printBookInfo("Green Eggs and Ham", "Dr. Seuss")
    printBookInfo2("Green Eggs and Ham", "Dr. Seuss", "Niloy Biswas", "Jane Doe", "John Doe")
    printBookInfo2("Harry Potter")
}

fun printBookInfo(title: String, author: String) {
    println("$title - Author: $author")
}

// * Make sure to use vararg as the last argument
fun printBookInfo2(title: String, vararg authors: String) {
    println("$title - Authors:")
    authors.forEach {
        println(it)
    }
}