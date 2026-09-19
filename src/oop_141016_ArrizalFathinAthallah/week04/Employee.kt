package oop_141016_ArrizalFathinAthallah.week04

open class Employee (val name: String, var baseSalary: Int) {
    open fun work() {
        println("$name sedang bekerja")
    }
    open fun calculateBonus(): Int{
        return (baseSalary * 10) / 100
    }
}