package oop_141016_ArrizalFathinAthallah.week02

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)

    print("Nama Hero: ")
    val name = scanner.nextLine()

    print("HP Hero: ")
    val hp = scanner.nextInt()

    print("Base Damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, hp, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("\nHP ${hero.name}: ${hero.hp} | HP Enemy: $enemyHp")
        println("1. Serang")
        println("2. Lari")
        print("Pilih: ")

        when (scanner.nextInt()) {
            1 -> {
                hero.attack("Enemy")
                enemyHp -= hero.baseDamage

                if (enemyHp < 0) {
                    enemyHp = 0
                }

                println("HP Enemy tersisa: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = Random.nextInt(10, 21)
                    hero.takeDamage(enemyDamage)

                    println("Enemy menyerang: $enemyDamage damage")
                    println("HP Hero yang tersisa: ${hero.hp}")
                }
            }

            2 -> {
                println("Hero Lari!")
                break
            }

            else -> {
                println("Pilihan tidak valid!")
            }
        }
    }

    if (hero.hp > 0 && enemyHp == 0) {
        println("${hero.name} MENANG!")
    } else if (hero.hp == 0) {
        println("${hero.name} KALAH!")
    } else {
        println("Pertarungan dihentikan.")
    }
}