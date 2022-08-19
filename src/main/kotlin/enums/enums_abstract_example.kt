package enums

fun main() {
    println(AccountType3.PLATINUM.calculateDiscountPercent())

    val fromAPI = "bRoNzE"
    val accountType = AccountType3.valueOf(fromAPI.uppercase())
    println(accountType)
    println(accountType.calculateDiscountPercent())
}

enum class AccountType3 {
    BRONZE {
        override fun calculateDiscountPercent(): Int {
            return 5
        }
    },
    SILVER {
        override fun calculateDiscountPercent(): Int {
            return 10
        }
    },
    GOLD {
        override fun calculateDiscountPercent(): Int {
            return 15
        }
    },
    PLATINUM {
        override fun calculateDiscountPercent(): Int {
            return 20
        }
    };

    abstract fun calculateDiscountPercent(): Int
}