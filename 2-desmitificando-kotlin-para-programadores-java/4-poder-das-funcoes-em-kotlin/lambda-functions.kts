// funções lambda ("lambdas") são uma maneira simples de criar funções ad-hoc
// pela inferência de tipo e à variável it implícita, funções lambdas podem ser denotados de forma muito concisa em muitos casos.

// são funções anônimas (ou seja, funções sem um nome) que podem ser usadas para criar pequenas funções de forma concisa e inline. 
// Elas são frequentemente usadas em situações em que você precisa de uma função temporária para uma única operação simples. 

// All examples create a function object that performs upper-casing.
// So it's a function from String to String

// Todos exemplos são funções lamdas declaradas de formas diferentes
// Todas recebem um String e retorna uma String
val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1

val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2

val upperCase3 = { str: String -> str.uppercase() }                     // 3

// esse você não sabe qual tipo de dado está saindo ou entrando, portanto dá erro
// val upperCase4 = { str -> str.uppercase() }                          // 4

// "it" é equivalente a instância atual que está usando a função
val upperCase5: (String) -> String = { it.uppercase() }                 // 5

// :: especifica a passagem de uma função para outra função ou retorno de uma função para outra função
// :: chama diretamente uma função
val upperCase6: (String) -> String = String::uppercase                  // 6

println(upperCase1("hello"))
println(upperCase2("hello"))
println(upperCase3("hello"))
println(upperCase5("hello"))
println(upperCase6("hello"))