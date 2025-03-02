package iii_functions

/**
 * All classes in Kotlin have a common superclass, Any, which is the default superclass for a class with no supertypes declared
 */

class Example  // Implicitly inherits from Any

// Any has three methods: 'equals()', 'hashCode()', and 'toString()'. Thus, these methods are defined for all Kotlin classes.
// By default, Kotlin classes are final – they can't be inherited. To make a class inheritable, mark it with the open keyword:

open class Ancestor // Class is open for inheritance

// To declare an explicit supertype, place the type after a colon in the class header:

open class Base(p: Int)
class Derived(p: Int): Base(p) // Parameter types must be the same 'String - String', 'Int - Int' etc.


// If the derived class has a primary constructor, the base class can (and must) be initialized in that primary constructor according to its parameters.
// If the derived class has no primary constructor, then each secondary constructor has to initialize the base type using the super keyword or it has to delegate to another constructor which does.
// Note that in this case different secondary constructors can call different constructors of the base type:


/**
    class MyView: View{
        constructor(context: Context): super(context) // Calls the superclass (View) constructor with a Context parameter.
        constructor(context: Context, attributes: AttributeSet): super(context,attributes) // Calls the superclass constructor with both Context and AttributeSet.
    }
*/
