package week06

interface Siswa {
    val namaSiswa:String
    fun belajar()
    fun mandi()
    fun mainGame() {
        println("$namaSiswa main game juga")
    }
}