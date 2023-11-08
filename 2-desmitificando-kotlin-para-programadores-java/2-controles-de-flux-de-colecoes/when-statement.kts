fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

// "Any" funciona semelhante ao "Object", ou seja, é o objeto mais primitivo
fun cases(obj: Any) {                                
    // when é semelhante a um switch case, porém com mais flexibilidade
    when (obj) {                                     // 1   
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        // else é opcional, semelhante ao default
        else -> println("Unknown")                   // 6
    }   
}

class MyClass