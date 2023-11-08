// apply: executa um bloco em determinado objeto que pode ser feito atribuições considerando a estrutura de propriedades desse objeto
data class Person(var nome: String, var age: Int, var about: String) {
    // sobrecarga de contrutor, se os parâmetros vinherem vazios, é obtido esses valores default
    constructor() : this("", 0, "")
}

fun main() {
    val jake = Person()                                     // 1
    val stringDescription = jake.apply {                    // 2
        name = "Jake"                                       // 3
        age = 30
        about = "Android developer"
    }.toString()                                            // 4
}