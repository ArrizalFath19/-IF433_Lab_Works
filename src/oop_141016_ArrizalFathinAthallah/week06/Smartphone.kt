package oop_141016_ArrizalFathinAthallah.week06

class Smartphone : Camera, Phone {

    override fun turnOn() {
        super<camera>.turnOn()
        super<phone>.turOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}