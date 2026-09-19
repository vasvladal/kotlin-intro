package section2

fun main() {
    val hasEggs = true
    val eggPrice = 5
    val hasBacon = false
    val baconPrice = 20
    var cost: Int = 0

    if (hasEggs) {
        cost = 12 * eggPrice

        if (hasBacon) {
            cost += (2 * baconPrice)
        }
    } else println("No eggs!!")

    println("Total cost: $cost")
}