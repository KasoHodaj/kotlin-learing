package iii_functions

/**
 * A higher-order function is a function that:
     * Takes another function as a parameter.
     * Returns a function as a result
 *
 *      fun functionName(
 *          parameter1: Type,
 *          parameter2: Type,
 *          operation: (ParamType1, ParamType2) -> ReturnType // Function as a parameter
 *      ): ReturnType {
 *          return operation(parameter1, parameter2) // Calls the function parameter
 * }
 *
 *      // Calling the function with a lambda
 *      val result = functionName(value1, value2) { param1, param2 ->
 *          // Lambda function body
 *          returnExpression
 *      }
 *
 */

fun main() {

    // Example 1.
    fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b) // Calls the passed function
    }
    val sumResult = operate(5,3) { x, y -> x + y}
    println("Sum: $sumResult")
    println()

    // Example 2.
    fun getGreetingFunction(languages: String): (String) -> String { // Returns a function ((String) -> String) – A lambda function that takes a name and returns a greeting.
        return when (languages) {
            "English" -> { name -> "Hello, $name!"}
            "Italian" -> { name -> "Ciao, $name!"}
            "Greek" -> { name -> "Γεια σου, $name!"}
            else -> {name -> "Hi, $name!"}
        }
    }
    val greetInEnglish = getGreetingFunction("Italian")
    println(greetInEnglish("Kaso")) // Output: Hello, Kaso!
    println()


    // Example 3.
    //Scenario: You're working on an app that processes a large dataset. You need a benchmarking function that measures execution time for any operation.
    fun measureTime(operation: () -> Unit) {   // A higher-order function that takes a lambda with no parameters
        // Unit = Void (generic parameter or return type)  // A function returning Unit does not return a value but can be used in higher-order functions and lambda expressions.
        val startTime = System.currentTimeMillis() // Captures the start time before running the lambda
        operation() // Executes the lambda fun
        val endTime = System.currentTimeMillis() // Captures the end time and prints execution time.
        println("Execution time: ${endTime - startTime}")
    }
    measureTime {
        Thread.sleep(500)
        println("Processing complete")
    }
    println()


    // Example 4.
    //Scenario: You need a flexible sorting function that sorts a list based on different criteria (e.g., length, alphabetical order, custom rules).
    fun <T> costumeSort(list: List<T>, comparator: (T,T) -> Int): List<T> { // <T> : Generic, // comparator: (T, T) -> Int: A lambda function that compares two elements and returns: i) A negative value if the first element should come before the second. ii) Zero if they are equal. iii) A positive value if the first should come after the second.
        return list.sortedWith(Comparator { a, b -> comparator(a, b) })
    }
    // Sorting words by length
    val words = listOf("Kotlin", "is", "awesome", "fun")
    val sortedWords = costumeSort(words) { a, b -> a.length - b.length }
    println(sortedWords) // Output: [is, fun, Kotlin, awesome]
    // Sorting numbers in descending order
    val numbers = listOf(5, 3, 8, 1)
    val sortedNumbers = costumeSort(numbers) { a, b -> b - a}
    println(sortedNumbers) // Output: [8, 5, 3, 1]
    println()

    // Example 4.
    //Scenario: You're building a network request handler. Sometimes, requests fail due to temporary issues, so you want to retry them automatically.
    fun retry(times: Int, operation: () -> Boolean) { //  A lambda function that returns true if successful and false if it fails.
        for(attempt in 1..times){
            if( operation() ) { // Calls operation() and checks if it succeeded (true).
                println("Operation succeeded on attempt: $attempt")
                return
            }
            println("Attempt $attempt failed, retrying...")
        }
        println("Operation failed after $times attempts") // If the operation never succeeds within the given attempts, it prints a failure message.
    }
    // Simulating a network request
    var attemptCounts = 0
    retry(9) { // it will try up to 9 times
         attemptCounts++
        val success = (attemptCounts == 8) // The operation succeeds only when attemptCounts == 8
        success
    }
}