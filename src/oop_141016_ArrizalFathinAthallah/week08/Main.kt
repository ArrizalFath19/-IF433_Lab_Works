package oop_141016_ArrizalFathinAthallah.week08

fun main(){
    println("=== TEST SAFE CALSS & ELVIS ===")
    val emptyOrder = Order(null,null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}
