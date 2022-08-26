package measure_execution_time

import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun main() {
    measure {

        val list = generateSequence(1) { it + 1 }
            .take(50_000_000)
            .toList()

        val result = list.filter { it % 3 == 0 }.average()

        print(list)
        println()
        println("Done!")

    }
}

//* measure the execution time
fun measure(block: () -> Unit) {
    val nanoTime = measureNanoTime(block)
    val millis = TimeUnit.NANOSECONDS.toMillis(nanoTime)
    println("$millis ms")
}

