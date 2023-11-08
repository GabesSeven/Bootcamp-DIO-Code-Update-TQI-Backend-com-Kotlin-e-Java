fun main() {
    val a = 10
    val b = 0
    // val b = 2


    // É possível ter zero ou vários "catch"
    // "finally" é opcional
    try {
        val divisao = a/b
    } catch(e: ArithmeticException) {
        println(e.message)
    } catch(e: ArrayIndexOutOfBoundsException) {
        println(e.message)
    } finally {
        println("Finally executado!")
    }

    // try {
    //     val divisao = a/b
    //     println(divisao)
    // } catch(e: Throwable) {
    //     println("\n-----------\n")
    //     e.printStackTrace()
    //     println("\n-----------\n")
    //     println(e.message)
    //     println("\n-----------\n")
    // } 
}