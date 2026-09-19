package section2

fun main() {
    // Lists are immutable so we cannot change its size
    val months = listOf("Jan", "Feb", "Mar")
    println(months[0])
    println(months[2])
    println(months.get(2))
    println(months.indexOf("Feb"))

    // ArrayList can be expanded or shrunk
    val letters = arrayListOf("a", "b", "c")
    letters.add("d")
    letters.remove("a")
}
