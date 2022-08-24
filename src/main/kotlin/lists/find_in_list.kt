fun main() {
    val names = listOf<String>("Donn", "Bob", "Jane", "Jenny", "Niloy", "Dang")
//    val result = names.find { it == "Donn" }
//    val result = names.firstOrNull { it == "Donn" }
//    val result = names.indexOfLast { it.lowercase().contains('x') }
//    val result = names.lastOrNull { it.lowercase().contains('j') }
    val result = names.filterNot { it.lowercase().contains('j') }
    println(result)
//    println(result?.length)
    println(result.size)
}