package classes_inner

fun main() {
    val vehicle = Vehicle()
    vehicle.brand = "Fiat"
    vehicle.info()

    val sw = vehicle.SteeringWheel()
    sw.info()

    val tr = vehicle.Transmission()
    tr.shift()
}

class Vehicle {
    var brand: String = "Unknown"

    fun info() = println(brand)

    inner class SteeringWheel {
        var name = "Leather"
        fun info() = println("$brand is the brand of vehicle with a $name steering wheel")
    }

    inner class Transmission {
        var type = "Automatic"
        fun shift() = println("The vehicle has shifted")
    }
}