package calling_from_java_kotlin.extensions

// Niloy Biswas = "NB"
fun String.initials() : String {
    val values = this.split(" ")
    val firstInitial = values[0].substring(0, 1)
    val lastInitial = values[1].substring(0, 1)
    return "$firstInitial$lastInitial"
}