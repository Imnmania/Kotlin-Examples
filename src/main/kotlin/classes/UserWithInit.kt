package classes

class UserWithInit (var firstName: String, var lastName: String) {

    constructor(firstName: String) : this(firstName, "Doe") {
        println("Printing from 2nd constructor")
    }

    init {
        println("Printing from init function 1")
    }

    init {
        println("Printing from init function 2")
    }

    fun printFullName() {
        println("$firstName $this.lastName")
    }

    fun printWithPrefix(prefix: String) {
        println("$prefix $this.lastName")
    }

    fun updateName(name: String) {
        this.firstName = name
    }

    override fun toString(): String {
        return "User_With_Init: ( firstName => ${this.firstName}, lastName => ${this.lastName} )"
    }
}