package week03

fun main() {
    val e = Employee("Budi")

    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n=== WEAPON TEST ===")
    val sword = Weapon("Dragon Slayer", 100)
    sword.damage = -50      // harus gagal
    sword.damage = 9999     // harus jadi 1000

    println("Weapon: ${sword.name}")
    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")

    println("\n=== PLAYER TEST ===")

    val player = Player("RyanX")
    player.addXp(50)   // masih level 1
    player.addXp(60)   // total 110 → level 2
}