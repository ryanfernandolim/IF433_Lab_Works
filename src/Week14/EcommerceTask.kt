package Week14

import java.io.File

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP"     -> basePrice * 0.90
            else      -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")
        file.appendText("$itemName,$finalPrice,$customerType\n")
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        File("orders.csv").printWriter().use { writer ->
            writer.println("$itemName,$finalPrice,$customerType")
        }
        println("Order disimpan ke CSV.")
    }
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
) {
    fun processOrder(itemName: String, finalPrice: Double, customerType: String) {
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double) = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.90
}

fun main() {
    val repo      = CsvOrderRepository()
    val notifier  = EmailNotifier()
    val processor = SafeOrderProcessor(repo, notifier)

    val vipStrategy     = VipPricing()
    val regularStrategy = RegularPricing()

    processor.processOrder("Laptop", vipStrategy.calculate(15000000.0), "VIP")
    processor.processOrder("Mouse", regularStrategy.calculate(250000.0), "REGULAR")
}