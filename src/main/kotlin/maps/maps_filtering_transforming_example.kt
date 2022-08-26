fun main() {

    var items = mutableMapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "NM" to "New Mexico",
        "CA" to "California",
        "TX" to "Texas",
        "WA" to "Washington",
        "OR" to "Oregon",
        "NV" to "Nevada",
        "CT" to "Connecticut",
        "FL" to "Florida",
        "AZ" to "Arizona",
        "MN" to "Minnesota",
        "NE" to "Nebraska"
    )

    val result = items.get("NY")
    println(result)

    if (items.any()) {
        // do something
    } else {
        // prompt
    }

    if (items.none()) {
        // do something
    } else {
        // prompt
    }

//    val result2 = items.filter { it.key == "NY" }
//    val result2 = items.filter { it.key.contains("N") }
    val result2 = items.filterKeys { it.contains("N") }
//        .map { it.value.substring(0, 3).uppercase() }
        .mapKeys { it.key.lowercase() }
    println(result2)
}