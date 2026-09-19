package section2

val pi = 3.14159

fun main() {
    val radii = listOf<Int>(
        (1..5).random(),
        (6..10).random(),
        (11..15).random()
    )

    radii.forEach { r: Int ->
        val area = getCircleArea(r)
        println("Area for circle of radius $r: $area")
    }
}

fun getCircleArea(r: Int) = pi * r * r
