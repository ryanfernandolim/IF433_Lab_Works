package week04

class Employee (val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name sedang berkerja")
    }

    open fun calculateBonus(): Int{
        return (baseSalary * 0.10).toInt()
    }
}