fun printMessage(message: String): Unit {                               // 1
    println(message)
}
// por padrão retorna nada, Unit retornada é semelhante ao "None" ou "null"

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

// Inline function, define ela em uma única linha
fun multiply(x: Int, y: Int) = x * y                                    // 4

fun main() {
    printMessage("Hello")                                               // 5                    
    printMessageWithPrefix("Gabriel", "é muito legal!")                              // 6
    printMessageWithPrefix("Hello")                                     // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(sum(1, 2))                                                  // 9
    println(multiply(2, 4))                                             // 10
}