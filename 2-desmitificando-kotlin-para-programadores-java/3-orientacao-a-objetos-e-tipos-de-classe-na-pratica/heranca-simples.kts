// Abstração: habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais
// Encpsulamento: esconder a implmentação dos objetos criando assim interfaces de uso mais concisas e fáceis de usar/entender
// Herança: permite que as classes compartilhem sus características (propriedades) e comportamentos (funções) entre si
// Polimorfismo: capacidade de um objeto poder ser referenciado de várias formas

// open class ou open function simboliza que a função ou a classe pode ser extendida por outra, ou seja, é aberta para outra classe
// override realiza polimorfismo na função, ou seja, sobrescreve o método. Só é possível extender um método open

open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

fun main() {
    // val dog = Yorkshire()
    val dog: Dog = Yorkshire()
    dog.sayHello()
}