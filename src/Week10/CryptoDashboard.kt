package Week10

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.85))
    coinRepo.add(Coin("ETH", 5.20))
    coinRepo.add(Coin("USDT", 1500.00))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("\nStatus Respons: ${response.status}")
    println("\n--- DAFTAR KOIN ---")
    response.data.forEach { coin ->
        println("Koin: ${coin.name} | Balance: ${coin.balance}")
    }
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TRX-001", 250000.0))
    txRepo.add(Transaction("TRX-002", -50000.0))
    txRepo.add(Transaction("TRX-003", 100000.0))

    println("\n--- DAFTAR TRANSAKSI ---")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount}")
    }
}