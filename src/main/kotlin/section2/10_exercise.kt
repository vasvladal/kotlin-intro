package section2

fun main() {
    // Variables
    val numCows = 3
    val numCowsWithMilk = 1
    val kids = 2

    // Requirements
    val req1 = numCows <= 5
    val req2 = numCowsWithMilk > 0
    val req3 = (1 + kids) >= 3

    val getsFunding = (req1 && req2) || req3
    println("getsFunding: $getsFunding")
}