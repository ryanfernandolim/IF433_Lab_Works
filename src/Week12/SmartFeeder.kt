package Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    println("=== SMART PET FEEDER SYSTEM ===")
    var currentKibbleStock = 50

    println("\n--- Jadwal Makan Pagi ---")
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("ERROR HARDWARE: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("ERROR STOK: ${e.message}")
    } catch (e: Exception) {
        println("ERROR UMUM: ${e.message}")
    }  finally {
    println("Siklus pengecekan dispenser pagi selesai.")
    }
}

