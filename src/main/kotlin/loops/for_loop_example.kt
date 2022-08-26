fun main() {

    val values = listOf(1,2,3,4,5,6,7)

    //* type 1
    for (item in values) {
        print("$item ")
    }
    println()

    //* type 2
    for (i in 0 until 10) {
        print("$i ")
    }
    println()

    //* type 3
    for  (i in 0 until 20 step 2) {
        print("$i ")
    }
    println()

    //* type 4
    for (i in 20 downTo 0) {
        print("$i ")
    }
    println()

    //* type 5
    val people = listOf(
        Person3("Niloy"),
        Person3("Biswas"),
        Person3("Donn"),
        Person3("Felker"),
    )

    for (i in people) {
        println(i.name)
    }

}

data class Person3(val name: String)