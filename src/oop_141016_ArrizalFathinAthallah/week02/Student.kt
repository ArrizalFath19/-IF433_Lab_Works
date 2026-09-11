package oop_141016_ArrizalFathinAthallah.week02

class Student (
    var name : String,
    var nim : String,
    var major : String,
    var gpa : Double, = 0.0
){
    // Body kosong
}

class Student (val name: String, val nim: String, val major: String) {
    init {
        if (nim.length !=5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid! ")
            println("Data mahasiwa $name mungkin akan bermasalah di sistem. ")
        }else {
            println("LOG : Objek Student $name berhasil dialokasikan di Memory. ")
        }
    }
    constructor(name: String, nim: String,) : this(name, nim, major = "Non-Matriculated"){
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan)")
    }
}
