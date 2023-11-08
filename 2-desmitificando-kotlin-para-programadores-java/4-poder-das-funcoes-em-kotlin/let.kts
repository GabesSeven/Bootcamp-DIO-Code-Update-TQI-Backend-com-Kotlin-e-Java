// primeira funcionalidade do let: função para executar um bloco caso o objeto seja nulo
// segunda funcionalidade do let: função de escopo
val empty = "test".let {               // 1
    // objeto é acessível dentro do bloco pela referência "it"
    customPrint(it)                    // 2
    // sempre a última instrução é a instrução de retorno
    it.isEmpty()                       // 3
}
println(" is empty: $empty")


fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    // executa somente se não for nulo
    str?.let {                         // 4
        print("\t")
        customPrint(it)
        println()
    }
}

fun printIfBothNonNull(strOne: String?, strTwo: String?) {
    // nomear o parâmetro "it", ou sejam criar personalizado
    strOne?.let { firstString ->       // 5 
        strTwo?.let { secondString ->
            customPrint("$firstString : $secondString")
            println()
        }
    }
}

printNonNull(null)
printNonNull("my string") 
printIfBothNonNull("First","Second") 