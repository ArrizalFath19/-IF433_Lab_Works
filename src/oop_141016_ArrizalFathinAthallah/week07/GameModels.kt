package oop_141016_ArrizalFathinAthallah.week07

enum class ItemRarity(val dropChange: Int) {
    COMMON(70), UNCOMMON(50), RARE(15), EPIC(5), LEGENDARY(1)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity)



