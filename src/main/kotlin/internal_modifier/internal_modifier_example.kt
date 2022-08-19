package internal_modifier


fun main() {
    val v = Vehicle("Red")
    val t = Truck("Blue")

//    t.addAxel(30)
    t.info()
}

internal class Axle (val numberOfWheels: Int) {
    //...
}

open class Vehicle(var color: String) {

    private lateinit var axles: MutableList<Axle>

    fun info() {
        println("The vehicle is $color")
    }

    fun addAxel(numberOfWheels: Int) {
        axles.add(Axle(numberOfWheels))
    }

//    fun getAxleInfo() : List<Axle> {
//        return axles
//    }
}

class Truck(color: String) : Vehicle(color) {
    init {
        addAxel(2)
        addAxel(5)
    }
}