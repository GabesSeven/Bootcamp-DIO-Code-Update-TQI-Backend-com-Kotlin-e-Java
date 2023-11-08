// é permitido também range de caracteres
for (c in 'a'..'d') {        // 1
    print(c)
}
print(" ")

for (c in 'z' downTo 's' step 2) { // 2
    print(c)
}
print(" ")


// pode-se usar range em estruturas condicionais
val x = 2
if (x in 1..5) {            // 1
    print("x is in range from 1 to 5")
}
println()

if (x !in 6..10) {          // 2
    print("x is not in range from 6 to 10")
}