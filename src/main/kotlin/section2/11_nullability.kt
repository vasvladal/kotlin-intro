package section2

fun main() {
    // Specifying the "?" at the end of the type allows for null assignment
    var name: String? = null

    // Compilation error
//    var otherName: String = null

    // Null variables use different arithmetic operators
    var num1: Int? = null
    var num2: Int = 2

    var total = num1?.plus(num2)
    total = num1?.minus(num2)

    // Elvis operator "?:" used to guarantee a value
    var elvis: Int? = num1 ?: 5 // Value is 5 if num1 is null

    // Developer guarantee "!!" that value will not be null
    /*
    Use only if you know that the value you're working with
    will not be null, but try to AVOID
     */
}