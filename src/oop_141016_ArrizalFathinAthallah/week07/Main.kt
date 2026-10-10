package oop_141016_ArrizalFathinAthallah.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n === TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n === TEST REGULER CLASS ===")
    val reg1 = RegulerUser("Alice", 22)
    val reg2 = RegulerUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")
}