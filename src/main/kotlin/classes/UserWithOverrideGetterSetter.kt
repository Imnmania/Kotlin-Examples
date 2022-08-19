package classes

class UserWithOverrideGetterSetter (var firstName: String, var lastName: String) {
    var fullName: String = "$firstName $lastName"
        get() = "Full Name: $field"
        set(value) {
            if (value.startsWith("Jon")) {
                field = "Jon Doe"
            } else {
                field = value
            }
        }
}