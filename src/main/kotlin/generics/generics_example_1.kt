package generics

import Person3

fun main () {
    val listOfStrings : List<String> = listOf("Donn", "John", "Mary")
    val listOfInts: List<Int> = listOf(1,2,3,4,5)
    val map: Map<String, Int> = mapOf("Donn" to 1, "Kon" to 2)

    val result = EvenList<String>(listOfStrings)
    println(result.evenItems())

    val result2 = EvenList<Int>(listOfInts)
    println(result2.evenItems())

    val people = listOf(
        Person3("A"), // 0
        Person3("B"), // 1
        Person3("C"), // 2
        Person3("D"), // 3
    )
    val result3 = EvenList(people)
    print(result3.evenItems())
}

class EvenList<T>(val list: List<T>) {

    fun evenItems(): List<T> {
        return list.filterIndexed { index, value -> index % 2 == 0 }
    }

}