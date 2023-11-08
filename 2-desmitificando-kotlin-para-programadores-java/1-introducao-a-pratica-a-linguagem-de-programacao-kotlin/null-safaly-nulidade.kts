fun strLength(str: String): Int {                   // 7
        // ?: Elvis Operator - semelhante a um operador ternário
        // str? - se for nula atribui 0 a "str" (safe null)
        // str!! - acesse de toda forma "str" (non-null asserted)
        
        // return notNull.length

        return str?.length ?: 0
    }

// condição simples para verificar nulidade
fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}

fun main() {
    // Está variável não aceita valores nulos
    var neverNull: String = "This can't be null"            // 1
    neverNull = null                                        // 2

    // Ponto de interrogação (?) - faz com que a vairável aceite também valores nulos
    var nullable: String? = "You can keep a null here"      // 3
    nullable = null                                         // 4

    var inferredNonNull = "The compiler assumes non-null"   // 5
    inferredNonNull = null                                  // 6

	println(strLength(neverNull))                                    // 8
	println(strLength(nullable))                                     // 9

    println(describeString(null))
    println(describeString(""))
    println(describeString("dio.me"))
}