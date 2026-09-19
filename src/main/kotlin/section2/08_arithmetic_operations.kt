package section2

// Exercise
fun main() {
    var funds = 1000.00
    println("Initial funds: $${funds}")

    // 5 years compund interest
    val interest = 1.055
    funds *= interest
    println("After year 1: $${funds}")
    funds *= interest
    println("After year 2: $${funds}")
    funds *= interest
    println("After year 3: $${funds}")
    funds *= interest
    println("After year 4: $${funds}")
    funds *= interest
    println("After year 5: $${funds}")
}