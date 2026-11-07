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

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    println("Top Performers: $topPerformersString")

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    println("Worst Performers: $worstPerformersString")

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("Unique Trading Pairs: $uniquePairs")

    println("\n=== CRYPTO TRADING DASHBOARD ===")

    topPerformersString.forEach {
        println(it)
    }

    println("\n=== WORST PERFORMERS ===")

    worstPerformersString.forEach {
        println(it)
    }

    println("\nUnique Trading Pairs: $uniquePairs")
}