package section2

interface Coffee {
    var coffeeType: String

    fun wakeUp() {
        println("Waking up!")
    }

    fun quench() {
        println("Ahh, thirst quenched!")
    }
}

class Arabica: Coffee {
    override var coffeeType: String = "Arabica"
    override fun quench() {
        println("Thirst quenched with $coffeeType")
    }
}

class Robusta: Coffee {
    override var coffeeType: String = "Robusta"
    override fun quench() {
        println("Thirst quenched with $coffeeType")
    }
}

fun orderCoffee(): Coffee {
    val choice = (0..1).random()
    return if (choice == 1) {
        Arabica()
    } else Robusta()
}

fun main() {
    val myCoffee = orderCoffee()
    myCoffee.wakeUp()
    myCoffee.quench()
}