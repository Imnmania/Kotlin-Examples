fun main() {

    val list = generateSequence(1) { it + 1 }
        .take(50_000_000)
        .toList()

    val result = list.filter { it % 3 == 0 }.average()

    print(list)
    println()
    println(result)
    println("Done!")
}