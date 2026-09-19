package section2

class Car {
    var model: String? = null
    var topSpeed: Int = 120

    fun start() {
        println("Started $model")
    }

    fun drive() {
        println("Driving at $topSpeed mph")
    }
}

// Use the "open" keyword to designate
// a class that can be inherited
open class Dog {
    var size: Int = 0

    fun bark() {
        println("Barking")
    }

    fun play() {
        println("Playing")
    }
}

class Corgi : Dog() {
    fun strut() {
        println("Strutting")
    }
}

fun main() {
    val myCar = Car()
    myCar.model = "Rivian"

    myCar.start()
    myCar.drive()

    val myDog = Corgi()
    myDog.bark()
    myDog.strut()
}