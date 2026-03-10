package week06

class KRS (override val nama: String, override val namaSiswa: String): Mahasiswa, Siswa {
    override fun belajar() {
        println("si $nama sedang belajar")
        println("siswa $namaSiswa sedang belajar juga")
    }

    override fun mainGame() {
        super<Siswa>.mainGame()
    }

    override fun makan() {
        println("makan")
    }

    override fun mandi() {
        println("mandi")
    }
}