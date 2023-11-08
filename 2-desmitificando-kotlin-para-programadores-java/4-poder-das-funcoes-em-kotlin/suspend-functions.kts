
// Suspend Functions irá ser executada em um contexto de coroutine
// Coroutine são maneiras de simplificar chamadas assíncronas

import kotlinx.coroutines.*

fun main() = runBlocking {
    doWorld()
}

// primeiro printa o "Hello ", depois do delay printa o "World"
suspend fun doWorld() = coroutineScope {
    launch {
        delay(1000L)
        println("World!")
    }
    print("Hello ")
}