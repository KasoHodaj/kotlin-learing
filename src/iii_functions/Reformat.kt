package iii_functions

//The reformat() function is just an example function that modifies a string based on the given parameters.
fun reformat(str: String, upperCase: Boolean = false): String {
    return if(upperCase) str.uppercase() else str
}

fun reformat(str: String, upperCase: Boolean, trim: Boolean = true, replaceSpaces: Boolean = false): String {
    return reformat(str,upperCase,trim,replaceSpaces, newChar = '-')
}

fun reformat(str: String, upperCase: Boolean = false, trim: Boolean = false, replaceSpaces: Boolean = false, newChar: Char = '*'): String {
    var result = str
    if (trim) result = result.trim()
    if (replaceSpaces) result = result.replace(" ", newChar.toString())
    if(upperCase) result = result.uppercase()

    return result
}

fun main() {
    println(reformat("hello")) // hello
    println(reformat("hello",true)) // HELLO

    println(reformat("  hello world     ",true, trim = false, replaceSpaces = true)) //// newChar = default
    println(reformat("  hello world     ",false, true,true)) // newChar = default

    println(reformat("   Kotlin   is  fun    ", true, false, true, newChar = '*'))
    println(reformat("   Kotlin   is  fun    ", true, false, true, '^'))
}