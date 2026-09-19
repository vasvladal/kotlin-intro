package section2

fun main() {
    val bigNumber = (100..500).random()
    println("Number: $bigNumber")

    var i = 1
    while (i < bigNumber) {
        if (i % 7 == 0) {
            println(i)
            i += 7
        } else i++
    }
}