package ii_control_flow

// When expressions and statements

fun main(){
    // 'when' is a conditional expression that runs code based on multiple possible values or conditions.
    // It is similar to the switch statement in Java, C, and similar languages. For example:

    /**
     *  Firstly, you can use 'when' either as an expression or as a statement.
     *  As an expression, 'when' returns a value for later use in your code.
     *  As a statement, 'when' completes an action without returning anything of further use.
     */

    // 'when' as a STATEMENT
    val x = 1;
    when (x){
        1 -> println("x = 1");
        2 -> println("x = 2");
        else -> println("x is neither 1 or 2");
    }

    // 'when' as an EXPRESSION
    val msg = when (x){
        1 -> "x = 1";
        2 -> "x = 2";
        else -> "x is neither 1 or 2";
    }
    println("msg: $msg");

    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x){
        0.toInt() -> println("0 encodes x");
        else -> println("0 does not encode x");
    }

    when (x) {
        in 1..10 -> println("x is in the range of [1,10]");
        !in 1..10 -> println("x is outside the range [1,10]");
        else -> println("None of the above");
    }

    val flag = "kotlin"
    fun hasPrefix(flag: Any) = when (flag){
        is String -> println(flag.startsWith("k")); // true
        else -> println("False") //false
    }
    hasPrefix(flag); // -> false

    when {
        isOdd(x) -> println("x is odd");
        !isOdd(x) -> println("x is even");
        else -> println("None of the above");
    }
}

fun isOdd(x: Int): Boolean {
    return x % 2 != 0 // Return true if x is odd, otherwise false
}