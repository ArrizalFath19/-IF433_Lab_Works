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

    println("\n=== TEST UPGRADE & BATTLE EVENTS ===")

    val upgradedItem = starterWeapon.item.copy(damage = 25)

    println("Damage pedang awal: ${starterWeapon.item.damage}")
    println("Damage setelah upgrade: ${upgradedItem.damage}")

    processEvent(BattleState.SafeZone)

    processEvent(
        BattleState.MonsterEncounter("Goblin Nakal")
    )

    processEvent(
        BattleState.LootDropped(upgradedItem)
    )

    processEvent(
        BattleState.GameOver("Terkena jebakan racun")
    )
}