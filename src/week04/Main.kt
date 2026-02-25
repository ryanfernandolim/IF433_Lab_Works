package week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    val ElectricCar = ElectricCar("BYD", 4, 72)
    ElectricCar.accelerate()
    ElectricCar.honk()
    ElectricCar.openTrunk()

    val manager = Manager("Budi", 10000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    val developer = Developer("Andi", 8000000, "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}