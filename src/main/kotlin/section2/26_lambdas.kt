package section2

fun main() {
    // LAMBDAS
    // Allow functions to be passed as a parameter
    // to other functions (Higher Order Function)
    val lambda = { name: String -> println("Hello $name")}
    val names = listOf("Thing 1", "Thing 2")
    sayHello(names, lambda)
}

fun sayHello(names: List<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}