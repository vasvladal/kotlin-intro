package section2

fun main() {
    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = arrayListOf("pen", "paper", "mug", "phone")
    items.removeAll(removedItems)

    println("Remaining Items: ${items}")
}