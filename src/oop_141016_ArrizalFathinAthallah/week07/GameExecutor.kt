package oop_141016_ArrizalFathinAthallah.week07

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> {
            println("Monster Keluar: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            println("Mendapatkan Item: ${event.item.name}")
            println("Rarity: ${event.item.rarity}")
        }

        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Pemain berada di zona aman.")
        }
    }
}