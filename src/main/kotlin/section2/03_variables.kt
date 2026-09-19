package section2

fun main() {
//    Mutable variables
    var age = 33
    age = 30

    var newAge = age + 1

    println(age)
    print(newAge)

//    Immutable variables
    val color = "red"
//    color = "blue"  // Error!

//    Naming variables
    /*
    - Can contain letters, numbers, underscores
    - Must start with a letter or underscore
    - Cannot be a Kotlin keyword
    - Camel-case naming convention
    - More presistent variables should traditionally have a more descriptive name
    - Variable must be defined before it can be set or referenced
     */
}