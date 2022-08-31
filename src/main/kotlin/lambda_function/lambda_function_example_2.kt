package lambda_function

fun main() {

    lineLogger {
        println("Message 1")
        println("Message 2")
        println("Message 3")
    }

}

//-----------
//-----------
fun lineLogger(block: () -> Unit) {
    repeat(2) { println("-----------") }
    block()
    repeat(2) { println("-----------") }
}