fun main() {
    var items = mutableMapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California"
    )

    //* add an item
    items.put("TX", "Texas")
    items["VG"] = "Virginia"
    println(items)

    //* remove an item
    items.remove("VG")
    println(items)

    //* safe input
//    items.put("NJ", "New Joisey") //! this will overwrite the previous value
    items.putIfAbsent("NJ", "New Joisey")
    println(items)

    //* remove by cherry picking
    items.remove("NJ", "New Joisey") //! remove only if the value is New Joisey
    println(items)

    //* retrieve, if not exist, insert with default value then retrieve
    val result = items.getOrPut("UT", { "Utah" })
    println(items)
    println(result)

    items.clear()
    println(items)

}