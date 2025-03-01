package i_basics

// Kotlin Operators

fun main(){
    // 1. Arithmetic Operators
    val a = 10;
    val b = 3;
    println(a+b);
    println(a-b);
    println(a*b);
    println(a/b);
    println(a/b.toDouble());
    println(a%b);


    // 2. Assignment Operators
    var x = 10
    x += 5  // Equivalent to: x = x + 5
    println("x += 5 -> $x") // 15

    x -= 3  // Equivalent to: x = x - 3
    println("x -= 3 -> $x") // 12

    x *= 2  // Equivalent to: x = x * 2
    println("x *= 2 -> $x") // 24

    x /= 4  // Equivalent to: x = x / 4
    println("x /= 4 -> $x") // 6

    x %= 5  // Equivalent to: x = x % 5
    println("x %= 5 -> $x") // 1

    // 3. Comparison Operators
    val i = 10
    val k = 5

    println(i === k) // false, checks if they have the same memory adress
    println(i == k) // false
    println(i != k) // true
    println(i > k)  // true
    println(i < k)  // false
    println(i >= k) // true
    println(i <= k) // false

    val stringA = "kotlin"
    val stringB = "kotlin"
    println(stringA === stringB); // true

    // 4. Logical Operators
    val boolA = true
    val boolB = false
    println(boolA && boolB);
    println(boolA || boolB);
    println(!(boolA && boolB));

    // 5. Increment & Decrement
    var num = 10

    println("num: ${num++}") // Prints 10, then increases to 11 (Post-increment)
    println("num: $num")     // Now num is 11

    println("num: ${++num}") // Increases to 12, then prints (Pre-increment)

    println("num: ${num--}") // Prints 12, then decreases to 11 (Post-decrement)
    println("num: $num")     // Now num is 11

    println("num: ${--num}") // Decreases to 10, then prints (Pre-decrement)

    // 6. Bitwise Operators
    val num1 = 4; // 0100 in binary
    println(num1 shl 1); // Left shift (multiplies by 2) → 8 (1000)
    println(num1 shr 1); // Right shift (divides by 2) → 2 (0010)

    val num2 = 5 // 0101 in binary
    println(num1 and num2); // Bitwise AND → 4 (0100) : Rule: 1 and 1 = 1, otherwise 0
    println(num1 or num2); //  Bitwise OR → 5 (0101)  : Rule: 1 or 1 = 1, 1 or 0 = 1, 0 or 0 = 0
    println(num1 xor num2); // Bitwise XOR → 1 (0001) : Rule: 1 xor 1 = 0, 1 xor 0 = 1, 0 xor 1 = 1, 0 xor 0 = 0
    println(num.inv()) // Bitwise NOT (Inverts bits)    : Rule: Inverts all bits (flips 0 to 1 and 1 to 0).

    // 7. Range Operators
    // Used for creating ranges of numbers.
    for (i in 1..5) {
        print("$i ") //  1 2 3 4 5: Creates a range from 1 to 5.
    }
    println()

    for (i in 5 downTo 1) {
        print("$i ") //  5 4 3 2 1: Counts backwards from 5 to 1.
    }
    println()

    for (i in 1..10 step 2) {
        print("$i ") //  1 3 5 7 9: Skips every 2nd number.
    }

}