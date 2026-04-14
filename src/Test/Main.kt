package Test
fun main() {
    val a = 10
    val b = 20
    println("Sum: ${"$"} {a+b}")

    for (i in 10 downTo 0 step 2)
        println(i)

    val price = 100

    val result = $$"""The Tag is ${price}"""
    val result = $$"""The Tag is $${price}"""
}