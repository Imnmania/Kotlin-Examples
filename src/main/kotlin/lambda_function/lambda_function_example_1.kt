package lambda_function

/*
*  val lambdaName: (InputType) -> ReturnType = { arguments: InputType -> body }
* */

fun main() {

    // * takes one input
    val greeter: (String) -> String = { name: String ->
        val foo = 0
        "Hello $name"
    }

    println(greeter("Niloy"))

    // * takes two input
    val greeter2: (String, String) -> String = { firstName: String, lastName: String ->
        val a = firstName.uppercase()
        val b = lastName.uppercase()
        "Hello $a $b"
    }

    println(greeter2("Niloy", "Biswas"))

    // * takes two input without type declare
    val greeter3 = { firstName: String, lastName: String ->
        val a = firstName.uppercase()
        val b = lastName.uppercase()
        println("Hello $a $b")
    }

    greeter3("John", "Snow")
}