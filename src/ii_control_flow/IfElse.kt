package ii_control_flow

// If expression
fun main(){
    // In kotlin there is not ternary operator
    // If as a STATEMENT
    var max = 10;
    if(max < 20){
        max = 20;
    }
    println("max: $max");

    // If else
    if(10 < 5)
        println("True");
    else
        println("False");

    var a  = 5
    var b = 7

    // If as an EXPRESSION ~ similar to ternary operator and less confusing with long conditions
    max = if(a > b) a else b;
    println("max: $max")

    // else if as an EXPRESSION
    max = if(a == b) 0 else if(a < b) b else if(a > b) a else -1
    println("max: $max");


}