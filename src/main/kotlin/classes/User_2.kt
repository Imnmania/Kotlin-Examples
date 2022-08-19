package classes

// * Class with primary constructor
//class User_2 constructor(var firstName: String, var lastName: String) {
class User_2 (var firstName: String, var lastName: String) {

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
        return "User_2: ( firstName => ${this.firstName}, lastName => ${this.lastName} )"
    }
}