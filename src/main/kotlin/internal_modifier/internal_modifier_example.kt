package internal_modifier


fun main() {
    val t = Truck("Blue")
    val v = Vehicle("Red")

//    t.addAxel(30)
    t.info()
    v.info()

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
        if (!::axles.isInitialized) {
            axles = ArrayList<Axle>()
        }
        axles.add(Axle(numberOfWheels))
    }

    // the block below will throw error, since Internal type can/should not be exposed to the public
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