package classes

class UserWithProperties (var firstName: String, var lastName: String) {

    var fullName = "$firstName $lastName"
    var age: Int = 0

    init {
        println("Init block for user => $fullName")
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
        return "User_With_Property: ( firstName => ${this.firstName}, lastName => ${this.lastName} )"
    }
}