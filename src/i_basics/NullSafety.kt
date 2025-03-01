package i_basics

/**
 * In Java, null references often lead to the dreaded NullPointerException (NPE).
 * Kotlin solves this issue with nullable types.
 */
fun main(){
    //Example 1: Nullable vs Non-Nullable
    var nonNullableString: String = "Hello"
//  e.g var nonNullableString = null ---> ERROR: Null can not be a value of a non-null type String
    println("nonNullableString: $nonNullableString")

    var nullableString: String? = "kotlin"
    println("nullableString: $nullableString")
    nullableString = null // Valid
    println("nullableString: $nullableString")


    // Accessing its properties or methods of a nun-null variable
    val a: String = "abc" // ---> non-null string
    val length = a.length
    println("length: $length")

    // Accessing its properties or methods of a Null variable
    var b: String? = "hi" // ----> b is declared as a nullable variable and can hold null values
    b = null
    println("b: $b") // null
    /**
        val lenB = b.length; // Attempting to access properties on nullables directly leads to an NPE
        println("lenB: $lenB"); // Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    **/

    // Example 2. Handling Nullable Variables (Kotlin's major advantage over Java)
    val isNotNull: String = "Hello World"
    println("isNotNull: ${isNotNull.length}")

    /**
        val isNull: String? = null;
        println("isNull: ${isNull.length}"); //Error: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    **/



    /** Safe call operator **/
    //The safe call operator ?. allows you to handle nullability safely in a shorter form.
    // Instead of throwing an NPE, if the object is null, the ?. operator simply returns null

    val x: String = "java"
    val y: String? = null
    // Check for nullability and returns length or null
    println("x: ${x?.length}") // java
    println("y: ${y?.length}") //null

    /**
     In general, safe calls are very useful in chains.
     INSTEAD OF:
          val headName: String?
          if (bob != null && bob.department != null && bob.department.head != null) {
              headName = bob.department.head.name
          } else {
              headName = null
    }
     WE CAN REPLACE WITH:
          val headName: String? = bob?.department?.head?.name
    **/


    // Elvis Operator
    // When working with nullable types, you can check for null and provide an alternative value.
    val c: String? = null
    // Checks for nullability, if not null, returns length. If null returns e.g. zero (0).
    val l: Int = c?.length ?: 0;
//  val l: String = (c?.length ?: "zero").toString(); // Int to String (TypeCasting is no valid in kotlin)
    println("l: $l");

    nullableString = null;
    println(nullableString?.length ?: "String is null")
}