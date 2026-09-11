package oop_141016_ArrizalFathinAthallah.week02

class hero(
    val name : String,
    var hp : Int = 100,
    val baseDamage : Int
) {
    fun attack(targetName : String) {
        println("$name Memberi Hit $targetName!")
    }

    fun takeDamage(damage : Int) {
        hp -= damage

        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive() : Boolean {
        return hp > 0
    }
}
