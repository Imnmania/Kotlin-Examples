package classes

class UserWithCompanionObj (var firstName: String, var lastName: String) {

    // they act similar to static functions in other programming languages
    companion object {
        fun createUser(firstName: String, lastName: String): UserWithCompanionObj {
            return UserWithCompanionObj(firstName, lastName)
        }

        private val users = mutableListOf<UserWithCompanionObj>()

        fun createUsers(count: Int): List<UserWithCompanionObj> {
            for (i in 1..count) {
                users.add(UserWithCompanionObj("Firstname${i}", "LastName${i}"))
            }
            return users
        }
     }

    override fun toString(): String {
        return "$firstName $lastName"
    }
}