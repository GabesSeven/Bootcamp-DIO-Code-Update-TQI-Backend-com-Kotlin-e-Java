// permite flexibilização em relação a tipagem do produto, mesmo conceito da pilha de tipo genérico

// <E> simboliza o parâmetro genérico, ou seja, permite qualquer tipagem
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
//   val stack = mutableStackOf(1, 2, 3)
//   val stack = mutableStackOf<Int>(1, 2, 3)
  val stack = mutableStackOf<String>("1", "2", "3")
  println(stack)

}