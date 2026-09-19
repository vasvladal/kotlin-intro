package section2

class Vehicle {

    // COMPANION OBJECTS
    // Can be used to perform certain functions without having to instantiate a class
    companion object {
        fun getInfo(): String {
            return "This is a car class"
        }
    }

    // Initialize all variables in the class
    var model: String? = null
    var topSpeed: Int
        // Use getters and setters for variables to add additional
        // functionality when the variable is accessed or modified
        get() = 100
        set(value) {
            println("Set new top speed: $value")
        }

    // INIT function runs before the class gets assigned to a variable
    init {
        println("Creating vehicle...")
    }

    // Define all the different kinds of constructors for this class
    constructor() {
        this.model = "No model"
        this.topSpeed = 100
    }

    constructor(newModel: String) {
        this.model = newModel
        this.topSpeed = 101
    }

    constructor(newModel: String, newSpeed: Int) {
        this.model = newModel
        this.topSpeed = newSpeed
    }
}

fun main() {
    println(Vehicle.getInfo())
    val myCar = Vehicle("Rivian", 200)
}