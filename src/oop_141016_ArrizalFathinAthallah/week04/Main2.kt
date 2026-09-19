package oop_141016_ArrizalFathinAthallah.week04

fun main() {
    val manager = Manager("Fathin", 2500000)

    manager.work()
    println("Bonus Manager: Rp${manager.calculateBonus()}")

    val developer = Developer("Arrizal", 3000000, "Java")
    developer.work()
    println("Bonus Developer: Rp${developer.calculateBonus()}")
}