
val authors = setOf("Shakespeare", "Hemingway", "Twain")
val writers = setOf("Twain", "Shakespeare", "Hemingway")

// compara a estrutura
// possuem a mesma estrtura, mabos conjuntos com três elementos
println(authors == writers)   // 1

// compara se estão alocado no mesmo endereço de memória
// cada conjunto possui um endereço em memória
println(authors === writers)  // 2