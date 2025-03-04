package iii_functions

/**
 * A lambda expression (or lambda) in Kotlin is an anonymous function that can be stored in a variable, passed as an argument, or returned from another function.
 * Example: val lambdaName: (ParameterType1, ParameterType2) -> ReturnType = { param1, param2 -> expression }
 *
 */

fun main() {
    val greetings = {
        name: String -> "Hello, $name!"
    }
    println(greetings("Alice"))  // Lambda function


    val lambdaName: (Int, Int) -> Int = { param1, param2 -> param1 + param2 }
    println("x + y: ${lambdaName(5,3)}")


    val sum: (Int , Int) -> Int = { a, b -> a * b }
    println("a * b: ${sum(3,3)}")

    // Lambda with No Parameters
    val greet: () -> String = { "Hello World" }
    println(greet()) // Hello World

    // Passing Lambdas as Arguments
    fun operate(p1: Int, p2: Int, operation: (Int, Int) -> Int): Int {
        return operation(p1,p2)
    }
    val results = operate(5,3) {i, j -> i * j}
    println(results)

    // Example 1: Finding the Largest Number (we want to compare two numbers and find the larger one)
    fun operate1(p1: Int, p2: Int, operation: (Int, Int) -> Int): Int {
        return operation(p1,p2) // Calls the function passed as a parameter
    }
    val maxResult = operate1(14,25) {i,j ->  if (i < j) j else j }
    println("Largest number: $maxResult") // Output: Largest number: 25

    // Example 2: Converting a String to Uppercase (process a string by transforming it into uppercase using a lambda.)
    fun operate2(input: String, operation:(String) -> String): String {
        return operation(input)
    }
    val toUpperString = operate2("hello kotlin users") { str -> str.uppercase()} // Can be replaced with it.uppercase(). 'it' can be used for single-parameter lambdas
    println("Upper case string: $toUpperString")






}