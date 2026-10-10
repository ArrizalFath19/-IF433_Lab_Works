package oop_141016_ArrizalFathinAthallah.week07

fun main() {
    println("=== TEST SINGLETON ===")
    DatabaseManager.connect()

    println("\n=== TEST GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST RARITY & FACTORY ===")
    println("Legendary drop chance: ${ItemRarity.LEGENDARY.dropChange}")

    val starterWeapon = Weapon.forgeStarterSword()

    println("Nama Senjata: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity ${starterWeapon.item.rarity}")
    println("Durability ${starterWeapon.durability}")
}