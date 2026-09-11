package oop_141016_ArrizalFathinAthallah.week02

import java.until.scanner

fun main() {
    val scanner = Scanner(source = System. 'in')

    println ("--- APLIKASI PMB UMN ---")

    print("Masukan Nama: ")
    val name = scannner.nextLine()

    print("Masukan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 Karakter!")

    } else {
        print("Masukan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}