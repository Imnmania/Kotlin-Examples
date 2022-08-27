package lazy_evaluation

import java.lang.Thread.sleep

fun main() {

    val name: String by lazy {
        println("Computed...")
        sleep(3000) //! long running operation
        "Donn"
    }

    println(name)
    println(name)
    println(name)

}