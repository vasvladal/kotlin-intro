package section2

fun main() {
    val year = 2026
    // A year is a leap year if divisible by 4, except centuries,
    // which must also be divisible by 400
    val isLeapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
    val months = mapOf<String, Int>(
        "Jan" to 31,
        "Feb" to if (isLeapYear) 29 else 28,
        "Mar" to 31,
        "Apr" to 30,
        "May" to 31,
        "Jun" to 30,
        "Jul" to 31,
        "Aug" to 31,
        "Sep" to 30,
        "Oct" to 31,
        "Nov" to 30,
        "Dec" to 31
    )

    for ((name, days) in months) {
        println("$name: $days")
    }
}
