package section2

class Calculator {
    var total: Double = 0.0

    fun add(value: Number) {
        val valDouble = value.toDouble()
        print("${this.total} + $valDouble = ")
        this.total += valDouble
        println(this.total)
    }

    fun subtract(value: Number) {
        val valDouble = value.toDouble()
        print("${this.total} - $valDouble = ")
        this.total -= valDouble
        println(this.total)
    }

    fun multiply(value: Number) {
        val valDouble = value.toDouble()
        print("${this.total} * $valDouble = ")
        this.total *= valDouble
        println(this.total)
    }

    fun divide(value: Number) {
        val valDouble = value.toDouble()
        print("${this.total} / $valDouble = ")
        this.total /= valDouble
        println(this.total)
    }

    fun reset() {
        this.total = 0.0
        println("${this.total} [RESET]")
    }
}

fun main() {
    val calc = Calculator()

    calc.add(10)
    calc.subtract(2)
    calc.multiply(1.5)
    calc.divide(4)
    calc.reset()
}