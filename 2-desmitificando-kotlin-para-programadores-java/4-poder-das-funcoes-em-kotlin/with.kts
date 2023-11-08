// with: função sem extensão que pode acessar membros de seu argumento de forma concisa (omitir o nome da instância)
class Configuration(val host: String, val port: Int)

fun main(){
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    // como se fosse um "self" ou "this"
    with(configuration) {
        println("$host:$port")
    }
    
    //alternative>
    configuration.run {
        println("host:$port")
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")
}