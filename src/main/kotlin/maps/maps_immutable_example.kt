fun main() {

    val states = mapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California"
    )

    println(states["NY"])
    println(states.get("NY"))
    println(states.get("FL"))

    val result = states.getOrDefault("FL", "N/A")
    println(result)

    val result2 = states["FL"] ?: "N/A"
    println(result2)

    val result3 = states.getOrElse("FL", { "UNKNOWN" })
    println(result3)

    println(states.containsKey("FL"))
    println(states.containsKey("NY"))
    println(states.containsValue("New York"))

    val result4 = states.entries
    println(result4)

    println(states.keys)
    println(states.values)

}