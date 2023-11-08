// Varargs permite passar qualquer número de string de argumentos, mesmo assim ele diferencia.

fun printAll(vararg messages: String) {                            // 1
    for (m in messages) println(m)
}
printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
    for (m in messages) println(prefix + m)
}
printAllWithPrefix(
    "Hello", "Hallo", "Salut", "Hola", "你好",
    prefix = "Greeting: "                                          // 4
)

// sem * passa somente o endereço de memória
// * passa endereço e valor de memória, ou seja, o que for alterado na função será alterado na main
fun log(vararg entries: String) {
    printAll(*entries)                                             // 5
}
log("Hello", "Hallo", "Salut", "Hola", "你好")