package oop_141016_ArrizalFathinAthallah.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("{$nama} sedang menyiapkan materi perkuliahan dan merevisi RKPS.")
    }

    fun mengajar() {
        println("{$nama} sedang mengajar mahasiswa di kelas.")
    }
}