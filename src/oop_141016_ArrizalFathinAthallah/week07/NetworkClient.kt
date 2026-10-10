package oop_141016_ArrizalFathinAthallah.week07

class NetworkClient private constructor(val url: String) {
    const val BASE_URL = "https://api.column.ac.id"

    fun createClient(): NetworkClient {
        println("Membangun NetworkClient dengan BASE_URL: $BASE_URL")
        return NetworkClient("$BASE_URL")
    }
}
    fun connect() {
        println("Connecting to $url...")
    }
}