package oop_00000112913_RyanFernando.week01

fun main() {
    val gameTitle = "DYNASTY WARRIORS: ORIGINS"
    val price = 945000

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )

    val userNote: String? = null

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

