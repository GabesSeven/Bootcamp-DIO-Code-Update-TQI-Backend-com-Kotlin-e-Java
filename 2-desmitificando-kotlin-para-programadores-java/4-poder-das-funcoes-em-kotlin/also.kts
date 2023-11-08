// semelhante ao apply, porém para acessar a referência é necessário o uso da palavra "it"
data class Person(var nome: String, var age: Int, var about: String) {
    // sobrecarga de contrutor, se os parâmetros vinherem vazios, é obtido esses valores default
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person) {
    println("A new person ")
}

fun main() {                                                // 1
    // nesse caso "it" é "Person("Jake", 30, "Android developer")"
    val jake = Person("Jake", 30, "Android developer")      // 1
    .also {                                                 // 2 
        writeCreationLog(it)                                // 3
    }                                            
}

