package oop_141016_ArrizalFathinAthallah.week05

class Ewallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran Ewallet  berhasil")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
    }
}