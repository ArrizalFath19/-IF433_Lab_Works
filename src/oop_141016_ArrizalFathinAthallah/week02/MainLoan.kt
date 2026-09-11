package oop_141016_ArrizalFathinAthallah.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukan Lama Peminjaman: ")
    val loanDuration = scanner.nextInt()

    if (loanDuration < 0) {
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)

    println()
    print("-- DETAIL PEMINJAMAN --")
    println("Judul Buku: ${loan.bookTittle}")
    println("Nama Peminjam: ${loan.borrower}")
    println("Lama Peminjaman: ${loan.loanDuration}")
    println("Total Denda: Rp${loan.calculateFine()}")
}