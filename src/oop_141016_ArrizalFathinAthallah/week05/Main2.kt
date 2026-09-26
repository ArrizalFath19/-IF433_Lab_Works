package oop_141016_ArrizalFathinAthallah.week05

fun main() {
    val Ewallet = Ewallet("Udin", 50000.0)
    val creditCard = CreditCard("Udin", 100000.0)

    val payments: List<PaymentMethod> = listOf(Ewallet, creditCard)

    for (payment in payments) {
        payment.processPayment(75000.0)

        if(payment is Ewallet) {
            payment.topUp(50000.0)
            payment.processPayment(75000.0)
        }
    }
}