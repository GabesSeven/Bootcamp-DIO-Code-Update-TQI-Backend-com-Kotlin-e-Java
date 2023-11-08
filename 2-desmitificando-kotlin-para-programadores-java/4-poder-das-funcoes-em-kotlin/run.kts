// chama a propriedade de maneira direta, semelhante ao "self" ou "this"
// enquando a função de escopo "let" necessita da referência da instância através do comando "it"

fun getNullableLength(ns: String?) {
    println("for \"$ns\":")
    ns?.run {                                                  // 1
        // se fosse com a função de escopo "let", teria de ser "" it.isEmpty() 
        println("\tis empty? " + isEmpty())                    // 2
        println("\tlength = $length")                           
        length                                                 // 3
    } ?: 0
}
print(getNullableLength(null))
print(getNullableLength(""))
print(getNullableLength("some string with Kotlin"))