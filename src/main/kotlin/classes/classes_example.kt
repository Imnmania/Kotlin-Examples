package classes

fun main() {
    var user = User()
    user.firstName = "Niloy"
    user.lastName = "Biswas"

    var friend = User()
    friend.firstName = "Jane"
    friend.lastName = "Doe"

    println(user.toString())
    println(friend.toString())

    user.printFullName()
    friend.printFullName()

    user.printWithPrefix("Mr.")

    friend.updateName("Bob")
    friend.printFullName()

    // * Classes with constructors (primary)
    var user2 = User_2(firstName = "Niloy", lastName = "Biswas")
    println(user2)

    // * Classes with multiple constructors
    var user3 = User_3("usr_3_firsName", "usr_3_lastName")
    println(user3)

    var user3_2 = User_3(firstName = "Niloy", lastName = "Biswas", isPlatinum = true)
    println(user3_2)

    var cousin = User_3("Cousin Name")
    println(cousin)

    // * Classes with initialize function
    val userWithInit =  UserWithInit(firstName = "fname", lastName = "lname")
    println(userWithInit)

    val userWithInit2 = UserWithInit("John")
    println(userWithInit2)

    // * Classes with properties
    val userWithProperty = UserWithProperties(firstName = "John", lastName = "Doe")
    println(userWithProperty)
    println(userWithProperty.fullName)
    userWithProperty.fullName = "Hello World"
    println(userWithProperty.fullName)
    println(userWithProperty.age)
    userWithProperty.age = 100
    println(userWithProperty.age)

    // * Classes with read-only properties
    val userWithReadOnlyProperties = UserWithReadOnlyProperties("Jane", "Doe")
    println(userWithReadOnlyProperties.fullNameLength)
//    userWithReadOnlyProperties.fullNameLength = 20  // ! should throw error since val is not assignable

    // * Classes with overriding getter
    val userWithOverrideGetterSetter = UserWithOverrideGetterSetter("Niloy", lastName = "Biswas")
    println(userWithOverrideGetterSetter.fullName)
    userWithOverrideGetterSetter.fullName = "Jon"
    println(userWithOverrideGetterSetter.fullName)
    userWithOverrideGetterSetter.fullName = "John Cena"
    println(userWithOverrideGetterSetter.fullName)

    // * Classes with companion objects ( similar to static classes in Java or Dart )
    val userWithCompanionObj = UserWithCompanionObj.createUser("Foo", "Bar")
    println(userWithCompanionObj)

    val users = UserWithCompanionObj.createUsers(5)
    println(users)
    users.forEach{ println(it) }
}

