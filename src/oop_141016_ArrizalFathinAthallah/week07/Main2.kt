package oop_141016_ArrizalFathinAthallah.week07

fun main() {
    println("=== TEST SINGLETON ===")
    DatabaseManager.connect()

    println("\n=== TEST GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()
}