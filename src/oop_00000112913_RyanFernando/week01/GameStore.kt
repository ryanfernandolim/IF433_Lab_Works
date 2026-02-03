package oop_00000112913_RyanFernando.week01

fun main() {
    val gameTitle = "DYNASTY WARRIORS: ORIGINS"
    val price = 945000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000)
        price - (price * 20 / 100)
    else
        price - (price * 10 / 100)

