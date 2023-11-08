// funções de alta ordem são funções que podem receber outras funções como parâmetro e retornar outras funções como resposta
// a função "operation" retornar a função "square" como resposta
fun operation(): (Int) -> Int {   
    // :: aciona um outra função pelo nome                                  // 1
    return ::square
}

fun square(x: Int) = x * x                                          // 2

fun main() {
    val func = operation()                                          // 3
    println(func(2))                                                // 4
}