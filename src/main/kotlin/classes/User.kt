package classes

class User {
    var firstName: String = ""
    var lastName: String = ""

    fun printFullName() {
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix: String) {
        println("$prefix $lastName")
    }

    fun updateName(name: String) {
        this.firstName = name
    }

    override fun toString(): String {
        return "User: ( firstName => ${this.firstName}, lastName => ${this.lastName} )"
    }
}