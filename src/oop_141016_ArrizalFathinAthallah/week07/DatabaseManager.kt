package oop_141016_ArrizalFathinAthallah.week07

object DatabaseManager {
    var connectionStatus: String = "Disconected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}