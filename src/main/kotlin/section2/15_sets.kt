package section2

fun main() {
    // Sets only save unique values
    val numberSet  = setOf(4, 2, 6, 9, 5, 2)
    println(numberSet)

    // Empty sets must have their type defined
    val initSet = setOf<Int>()

    // Sets are immutable, use HashSet for mutable sets
    val hashSet = hashSetOf(1,2,3,4,4,5,6)
    println(hashSet)
    hashSet.add(10)
    println(hashSet)
}