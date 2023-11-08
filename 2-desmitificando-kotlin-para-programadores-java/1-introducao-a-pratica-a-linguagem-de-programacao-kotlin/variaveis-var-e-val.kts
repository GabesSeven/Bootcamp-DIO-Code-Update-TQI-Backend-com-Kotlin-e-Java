var a: String = "initial"  // 1
println(a)
a = "final"
println(a)

// val são variáveis que não alterar o valor ao longo do programa
// var sã variáveis que alteram seu valor ao longo do programa 
val b: Int = 1             // 2
val c = 3                  // 3
println(b)
println(c)


// tentativa de definição de variável que ainda não foi inicalizada apontará erro
// var e: Int  // 1
var e: Int = 0  // 1
println(e)  // 2

// pode ser que sua estrutura atribua em algum momento a variável
val d: Int  // 1

if (someCondition()) {
    d = 1   // 2
} else {
    d = 2   // 2
}

println(d) // 3