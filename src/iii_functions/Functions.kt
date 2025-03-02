package iii_functions

// kotlin functions are declared using the fun keyword:
/**
 * fun functionName(parameter1: Type, parameter2: Type): ReturnType {
 *       return someValue
 * }
 */
fun ThisIsAFunctionInteger(parameter: Int): Int{
    return 2*parameter
}
fun main(){
    // Function usage
    // Functions are called using the standard approach:
    val value = ThisIsAFunctionInteger(10)
    println("Value: $value")

    println("e^2: ${(powerOff(2.7172,2))/10*10}")

    // Default arguments
    val byteArray = byteArrayOf(10, 20, 30, 40, 50)
    // Example 1: Calling with all parameters
    read(byteArray,1,3) // Reads 3 elements from index 1
    // Example 2: Reads using default 'off = 0'
    read(byteArray, len = 2) // Reads elements from index 0
    // Example 3: Reads using default 'length'
    read(byteArray, off = 1) // Reads elements from index 1
    // Example 4: Reads using default 'off' and 'length'
    read(byteArray) // reads all elements from index 0

}


 // Parameters
 // Function parameters are defined using Pascal notation - name: type.
 // Parameters are separated using commas, and each parameter must be explicitly typed:
 fun powerOff(number: Double, exponent: Int): Double {
     var sum: Double = number
     for(i in 2..exponent){
         sum *= number
     }
     return sum
 }


 // Default arguments
fun read(
     b: ByteArray,
     off: Int = 0,
     len: Int = b.size,
){
    println("Reading data from offset: $off, length: $len")

     // Simulate reading data
     for(i in off until (off + len).coerceAtMost(b.size)) {
         print("${b[i]} ")
     }
     println("\nRead operation complete.")
}



