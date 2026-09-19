package section2

fun main() {
    var attendance = hashMapOf("23 Sept" to 2837, "24 Sept" to 3726, "25 Sept" to 6253)

    attendance["26 Sept"] = 6253
    val total: Int = attendance.get("26 Sept")?.plus(attendance.get("25 Sept") ?: 0) ?: 0
    println("Attendees for Sept 25-26: $total")
    println("Sept 22 attendance available?: ${attendance.containsKey("22 Sept")}")
}