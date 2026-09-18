package oop_141016_ArrizalFathinAthallah.week03

fun main() {
    val player = Player("Fathin")
    println("Level awal: ${player.level}")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")

}