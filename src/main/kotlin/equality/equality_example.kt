fun main() {
    // structural
    var name1 = "Donn"
    var name2 = "Felker"

    println(name1 == name2)
    println(name1.equals(name2)) // similar to

    println(name1 != name2)

    // referential
    var a = 12
    var b = 12

    println(a === b) // doesn't work with primitives

    var c = Person("Donn")
    var d = Person("Donn")
    println(c !== d)

}

class Person(var name: String) {
    override fun toString(): String {
        return "Person: name => ${this.name}"
    }
}