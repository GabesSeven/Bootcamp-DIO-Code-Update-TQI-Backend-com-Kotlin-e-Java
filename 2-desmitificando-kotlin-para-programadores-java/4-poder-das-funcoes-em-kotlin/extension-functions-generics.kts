// Extension Function para qualquer tipo
fun <T> T?.nullSafeToString() = this?.toString() ?: "Ausência do valor"  // 1

fun main() {
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString)
}
