package classes

class UserWithReadOnlyProperties (var firstName: String, var lastName: String) {
    var fullName = "$firstName $lastName"

    // Read-only property
    val fullNameLength = fullName.length

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