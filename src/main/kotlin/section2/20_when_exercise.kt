package section2

fun main() {
    val name = "Bob"

    // Get first letter of name
    val firstLetter = name[0].lowercase()

    // Print greeting
    when (firstLetter) {
        "a", "b", "c" -> println("Salutations")
        "d", "e", "f" -> println("Ello m8")
        else -> println("Oi!")
    }
}