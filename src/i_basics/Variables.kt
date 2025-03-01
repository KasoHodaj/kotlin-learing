package i_basics

// Variables.kt - Immutable and Mutable Variables
fun main(){
    var variable = 10; // Mutable variable
    val constant = "hello world"; // Read-only variable (like Java's final)

    println("variable: $variable, constant: $constant");

    variable = 20;
//  constant = "my name is ...";  ERROR: Kotlin: <Val> cannot be reassigned

    println("variable: $variable, constant: $constant");
}