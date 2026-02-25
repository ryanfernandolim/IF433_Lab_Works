package week04

open class Employee (val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name sedang berkerja")
    }

    open fun calculateBonus(): Int{
        return (baseSalary * 0.10).toInt()
    }
}