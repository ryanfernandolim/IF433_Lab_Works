package week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Monster muncul: ${event.monsterName}")
        is BattleState.LootDropped -> println("Loot didapat: ${event.item.name} (${event.item.rarity})")
        is BattleState.GameOver -> println("Game Over: ${event.reason}")
        BattleState.SafeZone -> println("Pemain berada di Safe Zone.")
    }
}