// uma classe selada, garante que ela não vai ser extensível fora do pacote que ela foi definida
// permite criar restrição de visibilidade para outra classepara apenas o pacote que ela está inserido
sealed class Mammal(val name: String)                                                   // 1

// a propriedade catName que foi definida em Cat está sendo passado como parâmetro para o contrutor em Mammal
// Cat e Human extendem Mammal
class Cat(val catName: String) : Mammal(catName)                                        // 2
class Human(val humanName: String, val job: String) : Mammal(humanName)

// função genérica para gato e humano
fun greetMammal(mammal: Mammal): String {
    when (mammal) {                                                                     // 3
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4
        is Cat -> return "Hello ${mammal.name}"                                         // 5     
    }                                                                                   // 6
}

fun main() {
    // Tanto cat quanto human conseguem obter métodos e propriedades de Mammal, pois ambas as classes (Cat e Human) extendem Mammal 
    val cat = Cat("Snowy")
    val human = Human("Venilton", "Líder técnico na DIO")
    println(greetMammal(cat))
    println(greetMammal(human))

    // println(greetMammal(Cat("Snowy")))
}