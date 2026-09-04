package oop_141016_ArrizalFathinAthallah.week01


fun main() {
    val gameTitle : String = "Apex Legends"
    val price: Int = 620000

    printReceipt(title = gameTitle, priceAwa = price, priceakhir = calculateDiscount(price))
}

fun calculateDiscount(price: Int) : Int = if (price > 500000) price-price*20/100 else price-price*10/100

fun printReceipt(title: String,priceAwal: Int, priceakhir: Int) {
    println("Judul: $title, Harga Sebelum Diskon: $priceAwal, Harga Sesudah Diskon: $priceakhir ")
}