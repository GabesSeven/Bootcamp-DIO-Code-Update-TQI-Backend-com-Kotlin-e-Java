// Extension são maneiras de extender algumas funções ou propriedades dos elementos de uma maneira global
data class Item(val name: String, val price: Float)                                         // 1  

data class Order(val items: Collection<Item>)  

// Extension Funcitons que utilizam operador ternário
fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2  
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

// Extension Properties
val Order.commaDelimitedItemNames: String                                                   // 3
    get() = items.map { it.name }.joinToString()

fun main() {

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))
    
    println("Max priced item name: ${order.maxPricedItemName()}")                           // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")                                      // 5
}