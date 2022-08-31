package lambda_function

fun main() {

    /*
    * val lambdaName: (InputType) -> ReturnType = { arguments.InputType -> body }
    * */

    loremIpsum(5) { _, word -> // use underscore to ignore parameters
        print(word)
        print(" ")
    }

}

fun loremIpsum(times: Int, block: (Int, String) -> Unit) {
    repeat(times) { index ->
        val word = latinWords.random()
        block(index, word)
    }
}


val latinWords = listOf(
    "Lorem",
    "ipsum",
    "dolor",
    "sit",
    "amet",
    "consectetur",
    "adipiscing",
    "elit",
    "sed",
    "do",
    "eiusmod",
    "tempor",
    "incididunt",
    "ut"
)