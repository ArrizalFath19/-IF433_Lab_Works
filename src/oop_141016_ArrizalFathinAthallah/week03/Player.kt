package oop_141016_ArrizalFathinAthallah.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() {
            return (xp/100) + 1
        }

    fun addXp(amount: Int) {
        if(amount <= 0) {
            println("XP harus positif!")
            return
        }

        val oldlevel = level
        xp += amount

        if(level > oldlevel) {
            println("Level Up! Selamat $username berhasil naik ke level $level")
        }
    }
}