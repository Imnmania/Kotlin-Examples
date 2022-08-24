
fun main () {
    val toy = GenericToy(hasReturnPolicy = true)
    toy.discountPercent()
    print(toy.hasReturnPolicy)

}

interface Mammal {
    var hasHands: Boolean
    fun walk()
}

interface Cow: Mammal {
    fun moo() {
        println("MOOOOOOOO")
    }
}

interface Human: Mammal {
    fun speak()
}

//---
interface Discountable {
    var hasReturnPolicy : Boolean
    fun discountPercent() : Double
}

class GenericToy(override var hasReturnPolicy: Boolean) : Discountable {
    override fun discountPercent(): Double {
        println("Discount on digital products is 20%")
        return 20.0
    }
}

class DigitalProduct(override var hasReturnPolicy: Boolean) : Discountable {
    override fun discountPercent(): Double {
        println("Discount on digital products is 10%")
        return 10.0
    }
}