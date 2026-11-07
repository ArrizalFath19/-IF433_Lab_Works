package oop_141016_ArrizalFathinAthallah.week09

fun main() {
    println("=== TEST LAMBDA ===")

    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5, 10)}")
}