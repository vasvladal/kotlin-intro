package section2

fun main() {
    // 2 main types of iterators:
    // Collection
    val pets = setOf("dog", "cat", "bird")
    for (p in pets) {
        println("Hi $p")
    }

    // Range
    for (i in 1 .. 3) {
        println("Strike $i...")
    }
    println("Out!")
}
