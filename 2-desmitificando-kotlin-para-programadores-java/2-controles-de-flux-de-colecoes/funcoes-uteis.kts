// https://play.kotlinlang.org/byExample/05_Collections/07_firstlast


// "filter": filtrar coleção de dados a partir de uma regra condiiconal (predicato)
// notação "it" obtém números negativos
val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1
val positives = numbers.filter { x -> x > 0 }  // 2
val negatives = numbers.filter { it < 0 }      // 3

// "map" transformação de dados em todos elementos de uma coleção de dados
val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1
val doubled = numbers.map { x -> x * 2 }      // 2
val tripled = numbers.map { it * 3 }  

// "any", retora True se houver pelo menos um elemento na coleção
val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
val anyNegative = numbers.any { it < 0 }             // 2
val anyGT6 = numbers.any { it > 6 }                  // 3

// "all", retora True se todos elementos na coleção
val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
val allEven = numbers.all { it % 2 == 0 }            // 2
val allLess6 = numbers.all { it < 6 }                // 3

// "none", retora True se nenhum elemento na coleção
val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
val allEven = numbers.none { it % 2 == 1 }           // 2
val allLess6 = numbers.none { it > 6 }               // 3

// "find" e "findLast" para encontrar elementos
val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1
val first = words.find { it.startsWith("some") }                                // 2
val last = words.findLast { it.startsWith("some") }                             // 3
val nothing = words.find { it.contains("nothing") }                             // 4

// "flatMap" transofrma cada elemento de uma coleção em um objeto interável e retorna tudo em uma única lista como resultado de transformação
val fruitsBag = listOf("apple","orange","banana","grapes")  // 1
val clothesBag = listOf("shirts","pants","jeans")           // 2
val cart = listOf(fruitsBag, clothesBag)                    // 3
val mapBag = cart.map { it }                                // 4
val flatMapBag = cart.flatMap { it }                        // 5