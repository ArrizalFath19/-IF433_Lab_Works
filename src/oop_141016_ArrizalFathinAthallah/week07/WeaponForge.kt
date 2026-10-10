package oop_141016_ArrizalFathinAthallah.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val item = GameItem("Pedang Kayu Bapuk", 5,ItemRarity.COMMON)

            return Weapon(item, 50)
        }
    }
}