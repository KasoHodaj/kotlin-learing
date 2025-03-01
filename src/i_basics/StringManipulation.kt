package i_basics

// Kotlin provides several built-in functions to manipulate strings more concisely than Java

fun main(){
    // 1. Case Conversion
    var text: String = "Kotlin"
    //uppercase() → Converts to uppercase
    println("To Uppercase: ${text.uppercase()}");
    //lowercase() → Converts to lowercase
    println("To Lowercase: ${text.lowercase()}");

    // 2. Trimming Whitespace
    text = "    Kotlin is fun    ";
    println("Without trim: $text");
    //trim() → Removes leading & trailing spaces
    println("Trim: ${text.trim()}");
    //trimStart() → Removes spaces from the start
    println("Trim at start: ${text.trimStart()}");
    //trimEnd() → Removes spaces from the end
    println("Trim at end: ${text.trimEnd()}");

    // 3. Substring Extraction
    // substring(start, end) → Extracts a part of a string
    text = "Im learning kotlin";
    println("Substring: ${text.substring(5,text.length)}");

    // 4. Replace & Modify Strings
    text = "i love kotlin"
    //replace(old, new) → Replaces text
    println("replace text: ${text.replace("kotlin","java")}");
    //replaceFirst(old, new) → Replaces only the first occurrence
    println("replace first: ${text.replaceFirst("java","kotlin")}");
    //replaceAfter(delimiter, new) → Replaces everything after the delimiter
    val path = "folder/file.txt";
    println("replace after: ${path.replaceAfter("/","Documents/file.txt")}");
    //replaceBefore(delimiter, new) → Replaces everything before the delimiter
    println("Replace before: ${path.replaceBefore("/file.txt",":C/my_kotlin_project")}");

    // 4. Checking String Content
    text = "kotlin is fun";
    //contains(substring) → Checks if the string contains a value
    println(text.contains("is"));
    //startsWith(prefix) → Checks if the string starts with a value
    println(text.startsWith("K"));
    //endsWith(suffix) → Checks if the string ends with a value
    println(text.endsWith("n"));

    // 5. Splitting & Joining Strings
    text = "kotlin is fun";
    //split(delimiter) → Splits a string into a list
    println(text.split(" "))
    //joinToString(separator) → Joins a list into a string
    println(text.split(" ").joinToString("_"));

    // 6. String Length & Empty Check
    text = "kotlin";
    //length → Returns the number of characters
    println("length: ${text.length}");
    //isEmpty() → Returns true if the string is empty
    println("Is empty? ${text.isEmpty()}");
    //isBlank() → Returns true if the string is empty or only spaces
    println("Is empty or only spaces? ${text.isBlank()}");

    // 7. Multi-line Strings (""" """)
    // Triple quotes allow multi-line text formatting
    val multiText = """This is a 
            multi line string 
            in kotlin
            goodbye
    """.trimMargin()
    println("Multi line: $multiText");
}