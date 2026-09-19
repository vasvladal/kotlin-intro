package section2

/*
INTERFACES
- can be used to provide a template or structure for a class
- allows you to use the functionality of a class without knowing what is in that class
- classes can theoretically implement multiple interfaces
 */
interface Oven {
    // Cannot initialize values, just define and update them in interface functions
    var temperature: Int

    // Functions can be defined but left empty
    fun turnOn()
    fun turnOff()
    fun cook() {
        println("Cooking at Temperature: $temperature")
    }
}

class Samsung: Oven {
    // Use OVERRIDE to overwrite properties defined in the implemented interface
    override var temperature = 500

    override fun turnOn() {
        println("Turning on Samsung")
    }
    override fun turnOff() {
        println("Turning off Samsung")
    }
}

// FACTORIES are used to instantiate classes
fun samsungFactory(): Oven = Samsung()

fun main() {
    val myOven = samsungFactory()
}
