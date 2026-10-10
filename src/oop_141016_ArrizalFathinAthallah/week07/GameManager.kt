package oop_141016_ArrizalFathinAthallah.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instalasi ganda.")
        }else {
            isGameRunning = true
            println("Memulai Game Engine...")

        }
    }
}