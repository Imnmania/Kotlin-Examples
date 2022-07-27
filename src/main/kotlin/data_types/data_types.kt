package data_types

import java.math.BigInteger

fun main() {

    // * Integers
    val myByte: Byte = 8 //? 8-bit signed integer
    val myShort: Short = 16 //? 16-bit signed integer
    val myInt: Int = 32 //? 32-bit signed integer
    val myLong: Long = 64 //? 64-bit signed integer

    // * Decimals
    val myFloat: Float = 32.00F //? 32-bit floating point number
    val myDouble: Double = 64.00 //? 64-bit floating point number

    // * Conversion
    println(myByte.toLong()::class)

    // * Printing and formatting
    val bigLong: Long = 1_000_000
    println(bigLong)
    println(bigLong::class)

    // * String
    var fullName: String = "Hello world"
    println(fullName.length)
    println(fullName.toLowerCase())

    // * Char
    var c: Char = 'A' //? 16-bit unicode character
    println(c)

    // * Multiline string
    var message: String = "Hello,\nmy name is Niloy\nHow are you?"
    println(message)

//    var message2: String = """
//        Hello,
//        My name is Niloy Biswas
//        How are you?
//    """.trimIndent()
    var message2: String = """
        Hello,
        My name is Niloy Biswas
        How are you?
    """.replaceIndent(">>> ")
    println(message2)

    // * Booleans
    var isBlank: Boolean = false
    println(isBlank)
    println(isBlank.not())
    isBlank = "".isEmpty()
    println(isBlank)
    isBlank = "donn".isEmpty()
    println(isBlank)
}