package calling_from_java.models

data class Customer(val name: String) {

    fun customerHasLongName(): Boolean {
        return name.length > 0
    }

}