// Assim como no Java, na árvore de Excessões:
// Toda Object -> Throwable -> [Error, Exception]
// Error -> [OutOfMemoryError, StackOverFlowError, LinkageError]
// Exception -> [RuntimeException, IOException, IllegalArgumentException, IndexOutOfBoundException, FileNotFoundException, NumberFormatException, ArithmeticException, ArrayIndexOutBoundsException, SocketException]

// Erro é algo que não tem como prever o que vai acontecer
// Exceções 

// checket exceptions - obriga o programador a lidar com as exceções - KOTLIN NÃO POSSUI!
// unchecket exceptions - não obriga o programador a lidar (usar try-catch)

// KOTLIN - todas exceções não são obrigadas a serem tratadas, mas se fazer sentido para sua regra de negócio, elas podem ser introduzidas em um try-catch
// Isso tira a complexidade para o programador, pois ele trata conforme ele achar melhor

// @Throws para alertar os chamadores sobre possíveis exceções ao chamar código.
// @Throws(IllegalArgumentException::class)
// fun vote(name: String, age: Int) {
//     if (age < 16) {
//         throw IllegalArgumentException("$name não pode votar. Apenas pessoas com 16 anos ou mais podem votar.")
//     }
//     println("Voto de $name realizado com sucesso!")
// }

// fun main() {
//     vote("Venilton", 33)
//     vote("Maria", 10)
// }

// É possível criar suas próprias exceções
class IllegalVoterException(message: String) : Throwable(message)

@Throws(IllegalVoterException::class)
fun vote(name: String, age: Int) {
    if (age < 16) {
        throw IllegalVoterException("$name não pode votar. Apenas pessoas com 16 anos ou mais podem votar.")
    }
    println("Voto de $name realizado com sucesso!")
}

fun main() {
    // colocar o try-catch ou não resultará no mesmo resultado
    // try {
    //     vote("Venilton", 33)
    //     vote("Maria", 10)
    //     vote("Renan", 50)
    // } catch (e: IllegalVoterException) {
    //     e.printStackTrace()
    // }

    var quantidadeVotos = 0;

    quantidadeVotos += try { vote("Venilton", 33); 1 } catch (e: IllegalVoterException) { 0 }
    quantidadeVotos += try { vote("Maria", 10); 1 } catch (e: IllegalVoterException) { 0 }
    quantidadeVotos += try { vote("Renan", 50); 1 } catch (e: IllegalVoterException) { 0 }
    print(quantidadeVotos)
}

