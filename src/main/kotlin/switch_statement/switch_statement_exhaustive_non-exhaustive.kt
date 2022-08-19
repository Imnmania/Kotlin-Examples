package switch_statement

import enums.AccountType4

/*
* Exhaustive = you can't leave types from when statement / use else (default)
* */

fun main () {
    val accountType = AccountType4.SILVER

    // this is exhaustive
    val message = when(accountType) {
        AccountType4.GOLD -> "Gold Member"
        AccountType4.BRONZE -> "Bronze Member"
        AccountType4.SILVER -> "Silver Member"
        AccountType4.PLATINUM -> "Platinum Member"
        else -> "Unknown member type"
    }

    // this is non-exhaustive (no longer works)
//    when (accountType) {
//        AccountType4.GOLD -> println("Gold member")
//    }

    println(message)
}