package classes_nested

fun main() {
    val vehicle = Vehicle()
    vehicle.brand = "Fiat"
    vehicle.info()

    val sw = Vehicle.SteeringWheel()
    sw.info()

    val tr = Vehicle.Transmission()
    tr.shift()
}

class Vehicle {
    var brand: String = "Unknown"

    fun info() = println(brand)

    class SteeringWheel {
        var name = "The Steering Wheel"
        fun info() = println(name)
    }

    class Transmission {
        var type = "Automatic"
        fun shift() = println("The vehicle has shifted")
    }
}