package oop_141016_ArrizalFathinAthallah.week04

open class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {
    final override fun accelerate() {

    println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")

    }
}
