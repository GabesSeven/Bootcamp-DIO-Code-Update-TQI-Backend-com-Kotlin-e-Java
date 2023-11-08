
import java.util.Random

class LuckDispatcher {                    //1 
    fun getNumber() {                     //2 
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //1

    val dayRates = object {                                                     //2
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special       //3

    print("Total price: $$total")                                               //4

}

object DoAuth {                                                 //1 
    fun takeParams(username: String, password: String) {        //2 
        println("input Auth parameters = $username:$password")
    }
}

class BigBen {                                  //1 
    companion object Bonger {                   //2
        fun getBongs(nTimes: Int) {             //3
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}


fun main() {
    // Muitas vezes criamos intâncias para métodos que não necessitam, que poderiam ser acessados de outra forma
    // Por exemplo, objetos que geram número aleatórios podem ser acessados através de uma instância única (singleton) e não multiplas instâncias
    // Object Keywords permite criar singletons como design pattern
    // Object Keyword:
    val d1 = LuckDispatcher()             //3
    val d2 = LuckDispatcher()
    d1.getNumber()                        //4 
    d2.getNumber()


    // é possível criar um objeto dinâmico, ou seja, que tenha acesso a variáveis dentro do escopo do objeto
    // object Expression:
    rentPrice(10, 2, 1) 

    // acessar uma instância única (singleton) através do nome dela
    // Object Declaration: 
    DoAuth.takeParams("foo", "qwerty") 

    // Bloco para expor funções estáticas, no exemplo, o nome Bonger pode ser omitido e getBongs poderá ser acessa como se fosse uma função estática
    // Como se chamasse a função diretamente usando a classe
    // Companion Objects:
    BigBen.getBongs(12) 
}