package i_basics

// DataTypes.kt - Basic Data Types
fun main() {
    val one = 1; // Int
    val threeBillion = 3000000000; // Long
    val oneLong = 1L; // Long
    val oneByte: Byte = 1; // [-128,127]
    println("one: $one, threeBillion: $threeBillion, oneLong: $oneLong, oneByte: $oneByte");

    val pi = 3.14;          // Double
    // val one: Double = 1;    // Int is inferred
    val oneDouble = 1.0;    // Double
    println("pi: $pi, oneDouble: $oneDouble");

    val e = 2.7182818284;          // Double
    val eFloat = 2.7182818284f;   // Float, actual value is 2.7182817
    //If a value provided in this way contains more than 7 decimal digits, it is rounded.
    // Expected output: 2.7182818, Actual output: 2.7182817.
    // Explanation: The closest binary approximation within 32-bit precision is actually 2.7182817f.
    println("e: $e, eFloat: $eFloat");


    // You can use underscores to make number constants more readable:
    val oneMillion = 1_000_000;
    val creditCardNumber = 1234_5678_9012_3456L;
    val socialSecurityNumber = 999_99_9999L;
    val hexBytes = 0xFF_EC_DE_5E;
    val bytes = 0b11010010_01101001_10010100_10010010;
    val bigFractional = 1_234_567.7182818284;
    println(
        "oneMillion: $oneMillion, creditCardNumber: $creditCardNumber, socialSecurityNumber: $socialSecurityNumber, hexBytes: $hexBytes" +
                ", bytes: $bytes, bigFractional: $bigFractional"
    );


    // Boxing in Kotlin
    // Boxing is the process of converting a primitive type (like Int, Double, etc.) into its wrapper class
    //Example of Boxing
    val example1: Int = 10;  // Primitive type
    val boxedExample1: Int? = example1;  // Boxing: Int is converted into an Integer object

    // Unboxing is the opposite of boxing—it converts a wrapped object back into a primitive type.
    val boxedExample2: Int? = 20  // Boxed (an Integer object)
    val unboxedB: Int = boxedExample2!!  // Unboxing: Converted back to primitive Int


    // Boxing and caching numbers on the Java Virtual Machine
    val a: Int = 100;
    val boxedA: Int? = a;
    val anotherBoxedA: Int? = a;
    println(boxedA === anotherBoxedA) // true
    // val nullableInt: Int? = null    Valid --------> Int (without ?) is a non-nullable type; it cannot hold null.
    // val nonNullableInt: Int = null  Not Valid ----> Int? (with ?) is a nullable type; it can hold null.

    // Equality
    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedB === anotherBoxedB) // false, boxedB === anotherBoxedB checks whether boxedB and anotherBoxedB point to the same memory location
    println(boxedB == anotherBoxedB) // true, boxedB == anotherBoxedB checks whether the values inside the objects are equal.





}
     /**
     * Basic types
     * In Kotlin, everything is an object in the sense that you can call member functions and properties on any variable.
     * While certain types have an optimized internal representation as primitive values at runtime (such as numbers,
     * characters, booleans and others), they appear and behave like regular classes to you.
     *
     * This section describes the basic types used in Kotlin:

      * Numbers:
        * Integer types:
            * Byte: 8 bits, (-128,127)
            * Short: 16 bits, (-32768,32767)
            * Int: 32 bits, (-2,147,483,648, 2,147,483,647) ~ (-2^32,-2^31 -1)
            * Long: 64 bits, (-9,223,372,036,854,775,808, 9,223,372,036,854,775,807) ~ (-2^63,-2^63 -1)
        * Floating-point types:
            * Float: 32 bits, reflects the IEEE 754 single precision (Learn at Arithemic Methods > Sfalmata > Page 12/65)
            * Double: 64 bits, reflects the IEEE 754 double precision (Learn at Arithemic Methods > Sfalmata > Page 12/65)
        * Literal constants:
            * There are several kinds of literal constants for integral values:
            * Decimals: 123
            * Longs, ending with the capital L: 123L
            * Hexadecimals: 0x0F
            * Binaries: 0b00001011
        * Kotlin also supports conventional notation for floating-point numbers:
            * Floats, ending with the letter f or F: 123.5f
            * Doubles (default when the fractional part does not end with a letter): 123.5, 123.5e10

      * Booleans:
        * true or false
      *
      * Characters:
        * char, represents a 16-bit Unicode character.
        * Character literals go in single quotes: '1'
        * Special characters:
          * \t – tab
          * \b – backspace
          * \n – new line (LF)
          * \r – carriage return (CR)
          * \' – single quotation mark
          * \" – double quotation mark
          * \\ – backslash
          * \$ – dollar sign
      * Strings:
        * A string value is a sequence of characters in double quotes (")
        * val str = "abcd 123"
        * Escaped strings:
            * Escaped strings can contain escaped characters:
                * val s = "Hello, world!\n"
            * Multiline strings:
                * Multiline strings can contain newlines and arbitrary text. It is delimited by a triple quote ("""):
                    * val text = """ for (c in "foo"){ print(c) """
     */
