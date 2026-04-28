package test

class nonGeneric(var hasil:Any);

class generic<T>(var hasil:T);

class Kotak<T>(var kodepos:T, var telp:T)

fun main() {
    println("======= Non-Generic =======")
    val nGen =nonGeneric(100);
    val angkaNGen = nGen.hasil as Int;
    println(angkaNGen + 50);

    println("======= Generic =======");
    val gen = generic(200);
    println(gen.hasil + 50);
}