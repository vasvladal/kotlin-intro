package section2

fun main() {
    multiply(2)
    multiply(2, 3)

    sayHi("Tom", "Jerry")
}

/*
OVERLOADING
Multiple functions can have the same name as
long as they have different input args
 */
fun multiply(number: Int) = number * 2
fun multiply(number: Int, multiplier: Int) = number * multiplier

/*
VARIABLE PARAMS
Functions can accept a variable number of params
 */
fun sayHi(vararg names: String) {
    for (name in names) {
        println("Hi $name")
    }
}