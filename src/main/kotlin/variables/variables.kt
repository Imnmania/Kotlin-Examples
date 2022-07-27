package variables

fun main() {

    //? var keyword (MUTABLE)
    var fullName = "Niloy Biswas"
    println(fullName)

    fullName = "Biswas Niloy"
    println(fullName)

    println(fullName.isEmpty())

    //? val keyword (IMMUTABLE)
    val fName = "Donn Felker"
    println(fName)
    println(fName::class)

    //? assigning type to the variable
    val age: Int = 20
    println(age::class)




}
