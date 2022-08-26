package sequences

import measure_execution_time.measure


fun main() {

    listOf("A", "B", "C")
        .filter { item ->
            println("Filter: $item")
            true
        }
        .forEach{ item ->
            println("forEach: $item")
        }

    println("--------------------------")

    sequenceOf("X", "Y", "Z")
        .filter {
            println("filter: $it")
            true
        }
        .forEach {
            println("forEach: $it")
        }

    println("--------------------------")

    //* Another example

    measure {

        val list = generateSequence(1) { it + 1 }
            .take(50_000_000)

        val result = list.filter { it % 3 == 0 }.average()
        println(list)
        println("Done!")

    }

    println("--------------------------")
    //* Another example
    measure {
        val list = getListOfCustomers()
        val result = list
            .asSequence()
            .filter { it % 3 == 0 }
            .average()
        println(result)
        println("Done!")
    }
}

fun getListOfCustomers(): List<Int> {
    return generateSequence(1) { it + 1 }
        .take(50_000_000)
        .toList()
}