fun main() {

    val i = 2
    if (i in 1..5) {
        println("yes")
    } else {
        println("no")
    }

    //* this prints 0 -> n
    for (j in 0..10 step 2) {
        println(j)
    }

    //* this prints 0 -> n - 1
//    for (j in 0 until 10) {
//        println(j)
//    }

}