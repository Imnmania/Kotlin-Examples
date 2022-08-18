
/*
* no return type == Unit type == void type in dart
* */

fun main() {
    purpleCow()
    purpleCow()
    purpleCow()

    println(functionWithReturnType())

    sayHi()

    singleLineFunction()

    println(doWork(
        188,
        "Niloy",
        true
    ))
    println(doWork(
        12,
        "Polu",
        false
    ))

    printUserInfo(
        firstName = "Niloy",
        lastName = "Biswas",
        age = 27,
        isSunBurned = true,
        likesMovies = true,
        lovesPopCorn = true,
    )

    printUserInfo2(
        firstName = "Kamol",
        lastName = "Biswas",
        age = 27,
        likesMovies = false,
    )
}

fun purpleCow() {
    println("Hello Purple Cow!!!")
    println("Hello there")

    moo()
}

fun moo() : Unit {
    println("Moooo")
}

fun functionWithReturnType() : String {
    return "Return Value"
}

// * Function inside another function
fun sayHi() {
    println("Hello")

    // this only works within sayHi()
    fun sayBye() {
        println("Bye")
    }

    sayBye()
}

// * Single line functions
fun singleLineFunction() = println("Hi")

// * Functions with parameters
fun doWork(age: Int, name: String, isHappy: Boolean): String {
    return "Hi $name, You are $age, Your happiness is $isHappy"
}

// * Functions with Named parameters
fun printUserInfo(firstName: String, lastName: String, age: Int, isSunBurned: Boolean, likesMovies: Boolean, lovesPopCorn: Boolean) {
    println("$firstName $lastName is of age $age, Likes Movies: $likesMovies, Loves Popcorn: $lovesPopCorn, Sunburned: $isSunBurned")
}

// * Functions with Default values
// * Hit alt + enter and select put arguments on separate lines
fun printUserInfo2(
    firstName: String,
    lastName: String,
    age: Int,
    isSunBurned: Boolean = false,
    likesMovies: Boolean = true,
    lovesPopCorn: Boolean = false
) {
    println("$firstName $lastName is of age $age, Likes Movies: $likesMovies, Loves Popcorn: $lovesPopCorn, Sunburned: $isSunBurned")
}