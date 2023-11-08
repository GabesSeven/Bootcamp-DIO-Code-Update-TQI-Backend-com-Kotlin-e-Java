fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main(args: Array<String>) {
    var cakesEaten = 0
    var cakesBaked = 0
    
    // realiza a verificação, depois faz a ação
    while (cakesEaten < 5) {                    // 1
        eatACake()
        cakesEaten ++
    }
    
    // faz a ação, depois realiza a verificação 
    do {                                        // 2
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}