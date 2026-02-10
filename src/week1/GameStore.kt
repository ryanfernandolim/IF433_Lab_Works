package week1

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 600000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000)
        price - (price * 20 / 100)
    else
        price - (price * 10 / 100)

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan    : ${note ?: "Tidak ada catatan"}")
}
