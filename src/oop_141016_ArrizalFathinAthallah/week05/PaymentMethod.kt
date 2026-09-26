package oop_141016_ArrizalFathinAthallah.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

}