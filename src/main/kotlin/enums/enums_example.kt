package enums

fun main() {
    /*
    * Account Types:
    * Bronze
    * Silver
    * Gold
    * Platinum
    * */

    println(AccountType.PLATINUM)

    val accountTypeFromAPI = "gold"
    val accountType = AccountType.valueOf(accountTypeFromAPI.uppercase())
    println(accountType)
    println(accountType == AccountType.GOLD)
}

enum class AccountType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM,
}