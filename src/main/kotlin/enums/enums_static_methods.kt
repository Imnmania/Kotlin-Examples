package enums

fun main() {
    val accountType = AccountType4.getAccountTypeName("platinum")
    println(accountType)
}

enum class AccountType4 {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM;

    companion object {
        fun getAccountTypeName(name: String) : AccountType4{
            return valueOf(name.uppercase())
        }
    }
}