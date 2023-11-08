// permite flexibilização em relação a tipagem do produto

// <E> simboliza o parâmetro genérico, ou seja, permite qualquer tipagem

class MutableStack<E>(vararg items: E) {              // 1

  private val elements = items.toMutableList()

  fun push(element: E) = elements.add(element)        // 2

  fun peek(): E = elements.last()                     // 3

  fun pop(): E = elements.removeAt(elements.size - 1)

  fun isEmpty() = elements.isEmpty()

  fun size() = elements.size

  override fun toString() = "MutableStack(${elements.joinToString()})"
}


fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
//   val stack = mutableStackOf(0.62, 3.14, 2.7)
  val stack = mutableStackOf("A", "B", "C")
//   println(stack.push(9.87))
  println(stack.push("D"))
  println(stack)

  println("peek(): ${stack.peek()}")
  println(stack)

  for (i in 1..stack.size()) {
    println("pop(): ${stack.pop()}")
    println(stack)
  }
}