package section2

fun main() {
    // Map is a set of key/value pairs
    var count = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(count)

    // Empty maps must have key and value types defined
    var emptyMap = mapOf<Int,String>()

    // Maps are immutable, use HashMap for mutable option
    var hashMap = hashMapOf<Int, String>()
    hashMap[4] = "four"
}