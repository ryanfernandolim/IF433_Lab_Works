package oop_00000112913_RyanFernando.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100

    println("\n=== PERTARUNGAN DIMULAI ===")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nHP Hero  : ${hero.hp}")
        println("HP Musuh : $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")

        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("Musuh terkena serangan! HP Musuh sekarang: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh membalas dengan damage $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("HP Hero sekarang: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("Hero kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} MENANG!")
    } else if (!hero.isAlive()) {
        println("${hero.name} KALAH!")
    } else {
        println("PERTARUNGAN BERAKHIR TANPA PEMENANG")
    }
}
