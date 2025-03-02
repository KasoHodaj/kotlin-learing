package iii_functions

/**
 * The override keyword in Kotlin allows a subclass to provide its own
 * implementation of a function that is already defined in a superclass.
 */

// 'open':	Allows a function to be overridden in a subclass.
// 'override':	Used in a subclass to redefine a function.
// If a superclass function has default arguments, the overridden function in the subclass must NOT have them.


// 1. `open` allows a function to be overridden (functions are final by default)
open class A {
    open fun foo (i: Int = 10) {  /* Base implementation */  }
}

// 2. `override` lets a subclass redefine a function
class B: A() {
    override fun foo(i: Int) {  /* Overridden function, default value removed */  }
}

// 3. Default values (`=`) are NOT inherited in overridden functions!
//    The subclass must NOT include them in `override`

//----------------------------------------------------------------------------------------------------------------------
// Example 1.

// Parent Class
open class Animal {
    open fun makeSound() {
        println("Animal makes a sound")
    }
    fun sleep(){
        println("Animal is sleeping...")
    }
}

// Child class overriding the function
class Dog: Animal() {
    override fun makeSound(){
        println("Dog barks 'woof'") // New behavior
    }
}

//----------------------------------------------------------------------------------------------------------------------
// Example 2.

open class Shape {
    open val vertexCount: Int = 0
}

class Rectangle: Shape() {
    override val vertexCount = 4
}

//----------------------------------------------------------------------------------------------------------------------
// Example 3.

// Overriding rules
// To denote the supertype from which the inherited implementation is taken, use super qualified by the supertype name in angle brackets, such as super<Base>:

open class TwoDim {
    open fun draw() { println("Drawing from Rectangle") }
}

interface Polygon {
    fun draw() { println("Drawing from Polygon") } // interface members are 'open' by default
}

class Square : TwoDim(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<TwoDim>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
        println("Drawing from Square")
    }
}


fun main() {
    val animal = Animal()
    animal.makeSound() // Output: Animal makes a sound

    val dog = Dog()
    dog.makeSound() // Output: Dog barks
    dog.sleep()

    val square = Square()
    square.draw()
}













