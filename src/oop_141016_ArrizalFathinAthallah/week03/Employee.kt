package oop_141016_ArrizalFathinAthallah.week03

class Employee(val name : String) {
    var salary : Int = 0
        set(value) {
            if(value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0."
            } else {
                field = value
            }
        }

}