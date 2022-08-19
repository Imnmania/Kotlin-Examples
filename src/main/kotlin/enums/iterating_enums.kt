package enums

fun main() {
    for ( accountType in AccountType3.values() ) {
        println(accountType)
    }

    AccountType3.values().forEach { println(it) }
}