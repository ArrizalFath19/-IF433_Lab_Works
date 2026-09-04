package oop_141016_ArrizalFathinAthallah.week01


fun main() {
    val gameTittle : String = "Apex Legends"
    val price: Int = 620000

    val userNote: String?= null
    printReceipt(tittle = gameTittle, priceAwal = price, priceakhir = calculateDiscount(price), userNote = userNote )
}

fun calculateDiscount(price: Int) : Int = if (price > 500000) price-price*20/100 else price-price*10/100

fun printReceipt(tittle: String, priceAwal: Int, priceakhir: Int, userNote: String?){
    println("Judul: $tittle, Harga Sebelum Diskon: $priceAwal, Harga Sesudah Diskon: $priceakhir")
    println("Usernote: ${userNote ?: "None" } ")
}

