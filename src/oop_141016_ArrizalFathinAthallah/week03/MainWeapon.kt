package oop_141016_ArrizalFathinAthallah.week03

fun main() {
    val weapon = Weapon("Excalibur")

    weapon.damage = -50
    println("Damage: ${weapon.damage}")

    weapon.damage = 9999
    println("Damage: ${weapon.damage}")

    println("Nama Weapon: ${weapon.name}")
    println("Tier: ${weapon.tier}")
}