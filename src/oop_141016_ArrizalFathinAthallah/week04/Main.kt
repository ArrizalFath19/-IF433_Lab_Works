package oop_141016_ArrizalFathinAthallah.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Seda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val electricCar = ElectricCar("Tesla", 4, 50)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()
}