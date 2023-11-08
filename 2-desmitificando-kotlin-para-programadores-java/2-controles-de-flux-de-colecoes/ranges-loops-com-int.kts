// considera como menor ou igual a 3
for(i in 0..3) {             // 1
    print(i)
}
print(" ")

// considera como menor que 3
for(i in 0 until 3) {        // 2
    print(i)
}
print(" ")

// considera como menor ou igual a 3, pulando de 2 em 2
for(i in 2..8 step 2) {      // 3
    print(i)
}
print(" ")

// considera como maior ou igual a 0, decrementando
for (i in 3 downTo 0) {      // 4
    print(i)
}
print(" ")