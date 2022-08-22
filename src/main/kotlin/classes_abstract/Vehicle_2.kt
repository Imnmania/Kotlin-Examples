package classes_abstract

fun main() {
    val vh2 = Car("Blue", 14)
    vh2.openDoor()
    vh2.drive()
    println(vh2::class)

    val lambo = Lambo()
    lambo.drive()
    lambo.driveFast()
    lambo.turnOffIgnition()
    println(lambo.color)
}

abstract class Vehicle_2(
    val color: String,
    val numberOfWheels: Int,
    val numberOfDoors: Int
) {

    abstract fun drive()

    fun openDoor() {
        println("Door opened")
    }

    fun turnOffIgnition() {
        println("Turned off engine")
    }
}

abstract class ThreeWheelCar(
    color: String,
    numberOfDoors: Int
) : Vehicle_2(
    color = color,
    numberOfWheels = 3,
    numberOfDoors = numberOfDoors
) {

    abstract fun driveFast()

    override fun drive() {
        println("Driving from three wheel")
    }
}

// extends Vehicle_2 abstract class
class Car(
    color: String,
    numberOfWheels: Int
) : Vehicle_2(
    color = color,
    numberOfWheels = numberOfWheels,
    numberOfDoors = 2
) {

    override fun drive() {
        println("Driving")
    }

}

// extends ThreeWheelCar abstract class which extends Vehicle_2 abstract class
class Lambo() : ThreeWheelCar("red", 4) {
    override fun driveFast() {
        println("Lambo driving fast")
    }

//    override fun drive() {
//        println("Lambo driving slow")
//    }

}