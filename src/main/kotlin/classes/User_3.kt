package classes

class User_3 (var firstName: String, var lastName: String = "N/A", var isPlatinum: Boolean = false) {
    /*
    * this => calls the primary or default constructor based on the variables
    * */
//    constructor(firstName: String, lastName: String) : this(firstName, lastName, false) {
//        println("2nd constructor called")
//    }
//
//    constructor(firstName: String) : this(firstName, "Unknown") {
//        println("3rd constructor called")
//    }

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
        return "User_3: ( firstName => ${this.firstName}, lastName => ${this.lastName}, isPlatinum => ${this.isPlatinum} )"
    }
}