package maps

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

    val result = items.mapNotNull (::findValueInWebService)
    println(result)

}

fun findValueInWebService(entry: Map.Entry<String, String>): Map.Entry<String, String>? {
    if (entry.key.startsWith("N")) {
        return null
    } else {
        return entry
    }
}