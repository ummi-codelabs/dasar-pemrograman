fun main () {
    // deklarasi variable
    val nama_variable = "ini string"
    val nama_mahasiswa = "Resita" // gunakan val jika nilai tetap
    var nilai = 100 // gunakan var jika ingin mengubah suatu nilai

    //deklarasi variable
    val boolean_var = true
    val ini_boolean_false = false

    //deklarasi variable tipe data float
    val float_var = 0.05f

    println("""
        $nama_mahasiswa
        $nilai
        $boolean_var
        $float_var
    """.trimIndent()) // gunakan trimIndent dengan tanda """ 3 untuk mempermudah menggunakan tagbreak

    nilai = 98
    println("$nilai")
}