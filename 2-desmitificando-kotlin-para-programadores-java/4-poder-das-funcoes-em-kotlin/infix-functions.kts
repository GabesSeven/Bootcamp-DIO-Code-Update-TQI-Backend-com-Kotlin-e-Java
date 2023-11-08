// funções que podem ser convertida através de classes ou extensões que possuem um único parâmetro
fun main() {

    // repete o numero de vezes a string passada or parâmetro
  infix fun Int.times(str: String) = str.repeat(this)        // 1
  println(2 times "Bye ")                                    // 2

  // ambos os códigos criam um par de elementos do tipo string
  val pair = "Ferrari" to "Katrina"                          // 3
  println(pair)

  infix fun String.onto(other: String) = Pair(this, other)   // 4
  val myPair = "McLaren" onto "Lucas"
  println(myPair)

  val sophia = Person("Sophia")
  val claudia = Person("Claudia")
  // como se tivesse escrevendo um texto em Português mesmo
  sophia likes claudia                                       // 5
}

// adicionar Claudia a lista de pessoas que Sophia gosta
class Person(val name: String) {
  val likedPeople = mutableListOf<Person>()
  infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}