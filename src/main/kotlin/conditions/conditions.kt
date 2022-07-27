package  conditions


fun main() {
    var calories = 1600
    if (calories >= 2000) {
        print("You have consumed all the calories for today");
    } else if(calories >= 1500) {
        println("You are almost there")
    } else {
        println("You still have some calories left")
    }
}