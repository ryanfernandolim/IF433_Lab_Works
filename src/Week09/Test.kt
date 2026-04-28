package Week09

fun main() {
    println("========= LIST OF =========")
    var arMhs = listOf("Budi", "Susi", "Titus")

    println(arMhs)
    println("Panjang List ${arMhs.size}")
    println(arMhs[1])

    for(a in arMhs) {
        println("Mahasiswa bernama: $a")
    }

    println("\n========= MUTABLE LIST =========")
    var arAngka = mutableListOf(10,30,40,20,90,100,15)
    println(arAngka)

    arAngka.add(777)
    arAngka[2] = 123
    arAngka.removeAt(3)

    println(arAngka)

    println("\n========= SET OF =========")
    var arUrutan = setOf(20,30,40,20,70,30,10,100)
    println(arUrutan)
    println("ad angka 40 ga?" + arUrutan.contains(40))

    println("\n========= MUTABLE SET OF =========")
    var arMakanan = mutableSetOf("Nasi", "Bakpao", "Mie", "Ayam", "Ayam lagi")
    arMakanan.add("Ketoprak")
    arMakanan.remove("Mie")
    arMakanan.add("Mie")
    println(arMakanan)

    println("\n========= MAP OF =========")
    var arSiswa = mapOf(
        "Andi" to 89,
        "Toni" to 73,
        "Ivander" to 90
    )
    println("banyak data siswa: ${arSiswa.size}")
    println("Nilai si Andi " + arSiswa["Andi"])
    println("semua keys: " + arSiswa.keys)
    println("semua values: " + arSiswa.values)
    println(arSiswa.keys.elementAt(1))
    println(arSiswa)

    println("\n========= MUTABLE MAP =========")
    var arMenu = mutableMapOf(
        "Nasi" to 1000,
        "Ayam" to 2000,
        "Sayur asem" to 1500
    )

    println("Banyak menu: " + arMenu.size)
        arMenu["Nasi"] = 500
        arMenu.remove("Ayam")
        arMenu.put("Udang", 2300)
    println(arMenu)
}