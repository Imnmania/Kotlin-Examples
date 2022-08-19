package enums

fun main() {
    println(AccountType2.GOLD)
    println(AccountType2.GOLD.discountPercent)
    println(AccountType2.GOLD.numberOfSubscriptions)

    val value = AccountType2.valueOf("Silver".uppercase())
    println(value)
    println(value.discountPercent)
    println(value.numberOfSubscriptions)
}

enum class AccountType2 (val discountPercent: Int, val numberOfSubscriptions: Int) {
    BRONZE(10, 1),
    SILVER(15, 5),
    GOLD(20, 10),
    PLATINUM(25, 15),
}