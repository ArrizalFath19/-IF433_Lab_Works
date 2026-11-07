package oop_141016_ArrizalFathinAthallah.week09

fun main() {
    val tradeHistory = listOf(
        Tradelog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        Tradelog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        Tradelog("BTCUSDT", "SHORT", 15, 8.5, "CLOSED"),
        Tradelog("ETHUSDT", "LONG", 10, -3.5, "CLOSED"),
        Tradelog("BNBUSDT", "LONG", 5, 2.8, "OPEN"),
        Tradelog("BTCUSDT", "LONG", 10, 0.0, "OPEN")
    )

    println(tradeHistory)

    val closedTrades = tradeHistory.filter {
        it.status == "CLOSED"
    }

    println("Closed Trades: $closedTrades")

    val winningTrades = closedTrades.filter {
        it.roe > 0
    }

    println("Winning Trades: $winningTrades")

    val losingTrades = closedTrades.filter {
        it.roe <= 0
    }

    println("Losing Trades: $losingTrades")
}