package section2

fun main() {
    val customers = hashSetOf<String>(
        "Liam",
        "Harry",
        "Louis",
        "Zayn"
    )

    customers.add("Niall")
    println("Customers: $customers")

    customers.remove("Zayn")
    println("Customers: $customers")
}