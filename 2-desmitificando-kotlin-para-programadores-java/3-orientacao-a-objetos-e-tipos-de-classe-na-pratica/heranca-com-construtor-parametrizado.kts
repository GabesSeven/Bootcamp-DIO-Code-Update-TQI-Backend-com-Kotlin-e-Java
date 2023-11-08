// construtor executa quando a classe é instânciada
open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

// herda uma classe já passando um parâmetro 
class SiberianTiger : Tiger("Siberia")                  // 1

fun main() {
    // val tiger = SiberianTiger()
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}