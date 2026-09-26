package oop_141016_ArrizalFathinAthallah.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount : Double = 0.0

    override fun processPayment(amount: Double) {
        if(usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran CreditCard berhasil")
        } else {
            println("Transaksi di tolak")
        }
    }
}