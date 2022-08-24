fun main() {
    val mine = listOf<String>("Apples", "Grapes")
    val theirs = listOf<String>("Oranges", "Pears", "Strawberry")
    val others = listOf<String>("Kiwi", "Watermelon")
    val allOfUs = listOf(mine, theirs, others)

    println(allOfUs)
    println(allOfUs.flatten())

    val mineArray = arrayOf<String>("Apples", "Grapes")
    val theirsArray = arrayOf<String>("Oranges", "Pears", "Strawberry")
    val othersArray = arrayOf<String>("Kiwi", "Watermelon")
    val allOfUsArray = arrayOf(mineArray, theirsArray, othersArray)

    println(allOfUsArray)
    println(allOfUsArray.flatten())
}