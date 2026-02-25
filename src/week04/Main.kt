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
}