package lambda_function

/*
*  val lambdaName: (InputType) -> ReturnType = { arguments: InputType -> body }
* */

fun main() {

    lineLogger {
        println("Message 1")
        println("Message 2")
        println("Message 3")
    }

    repeater(5) {index ->
        if (index < 3) {
            // 3 times
            println("Hello")
        } else {
            // 2 times
            println("Goodbye")
        }
    }

    derbyAnnouncer { player: String ->
        "$player is a great asset to the team!"
    }

}

//-----------
//-----------
fun lineLogger(block: () -> Unit) {
    repeat(2) { println("-----------") }
    block()
    repeat(2) { println("-----------") }
}

fun repeater(times: Int, block: (Int) -> Unit) {
    repeat(times) { index -> block(index) }
}

fun derbyAnnouncer(block: (String) -> String) {
    val players = listOf(
        "McGwire",
        "Canseco",
        "HoneyCutt",
        "Davis",
        "Dawley",
        "Weiss"
    )

    val randomPlayer = players.random()
    println("The next player is ... $randomPlayer")
    val announcerMessage = block(randomPlayer)
    println(announcerMessage)
}