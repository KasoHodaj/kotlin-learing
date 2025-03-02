package ii_control_flow;

fun main(){
    // For loops
    // The for loop iterates through anything that provides an iterator.
    // e.g. -> for (item in collection) println(item);

    for(i in 1..10) print("$i\t");

    //The body of for can be a block.

    println("\n\nThis is an example of a for loop block:");
    for(i in 1..10) {
        print("$i\t");
    }

    println("\nFor loop block with step = 2")
    for (i in 0 downTo -10 step 2) {
        print("$i\t");
    }

    println("\nFor loop block with step = 2")
    for (i in 6 downTo 0 step 2) {
        print("$i\t");
    }

    // A for loop over a range or an array is compiled to an index-based loop that does not create an iterator object.
    val array = arrayOf(1,2,3,4,5); // -----> Type is inferred automatically
    val myArr: IntArray = intArrayOf(1,2,3,4,5) // ---> More Efficient

    println()
    for (i in array.indices) {
        print("No$i: ${array[i]}\t")
    }

    println()
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }


    // While loops
    var x = 10;
    while (x >= 0) {
        print("x: " + x-- + "\t")
    }


    // Do-while
    println()
    do {
        print("x: " + ++x + "\t")
    }while (x<10)

}