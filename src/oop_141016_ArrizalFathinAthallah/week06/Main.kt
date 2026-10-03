package oop_141016_ArrizalFathinAthallah.week06

fun processCheckout(Method: PaymentMethod, amount : Double) {
    println("-> Memulai checkout...")
    Method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1,50000.0)
    processCheckout(pay2,150000.0)
}