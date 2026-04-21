package Week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG",  20,  15.5,  "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10,  -5.2,  "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15,  8.3,   "CLOSED"),
        TradeLog("SOLUSDT", "LONG",  10,  -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG",  5,   22.1,  "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 10,  3.7,   "OPEN"),
        TradeLog("BTCUSDT", "LONG",  25,  -2.5,  "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    val losingTrades = closedTrades.filter { it.roe <= 0}
}