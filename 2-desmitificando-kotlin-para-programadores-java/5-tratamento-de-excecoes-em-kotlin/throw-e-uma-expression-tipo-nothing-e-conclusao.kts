data class Person(val name: String?)

// Pode ser usado exeções no Elvis operator ou operador ternário
fun main() {
    val person = Person("Venilton")
    // val person = Person(null)
    val s = person.name ?: throw IllegalArgumentException("Name required")
    print(s)
}

// Todas variáveis null vão possuir o tipo Nothing, ou seja, não possui valor algum
val x = null           // 'x' has type `Nothing?`
val l = listOf(null)   // 'l' has type `List<Nothing?>

// Já "unit" é semelhante ao "void" no Java