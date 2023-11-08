fun main() {
    val a = 10
    val b = 0
    // val b = 2

    // é possível atribuir um resltado do try catch direto a uma variável
    val divisao : Int? = try { a/b } catch (e: ArithmeticException) { null }
    // pode deixar o tipo omisso, pois o valor manipulado dentro do try catch já é um inteiro
    val divisao = try { a/b } catch (e: ArithmeticException) { null }
    println(divisao)


    // no caso de ter mais de um comando dentro do try catch, ele sempre pega o último comando
    val divisao = try { 
        println("Divisão realizada com sucesso!") // se o println for o último comando, executará erro, pois o println não possui valor de retorno válido
        a/b 
    } catch (e: ArithmeticException) { 
        println("Divisão com erro!") // se o println for o último comando, executará erro, pois o println não possui valor de retorno válido
        null 
    } finally {
        println("Finally!")
    }
    println(divisao)
}