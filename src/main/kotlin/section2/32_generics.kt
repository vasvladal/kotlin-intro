package section2

class Bike<T> {
    fun display(value: T) {
        println(value.toString())
    }
}

fun main() {
    val bike = Bike<Int>()
    bike.display(100)
}