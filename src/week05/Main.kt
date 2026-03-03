package week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)
    val math = MathHelper()

    val ewallet = EWallet("Ryan", 50000.0)
    val creditCard = CreditCard("Ryan", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(
        ewallet,
        creditCard
    )

    for (payment in paymentList) {
        payment.processPayment(75000.0)

        if (payment is EWallet) {
            payment.topUp(50000.0)
            payment.processPayment(75000.0)
        }

        println("----------------------")
    }

    println("Luas Persegi: ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(5, 3)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }
}