package oop_00000112913_RyanFernando.week02

class Student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasisiwa $name mungknin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
    constructor(name: String, nim: String) : this(name, nim, "Non-marticulated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}