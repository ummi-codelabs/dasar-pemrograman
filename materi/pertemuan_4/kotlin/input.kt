package pertemuan_4

import java.util.*

fun main () {

    //membuat objek scanner
    val newScanner = Scanner (System.`in`)

    //mengambil input
    print("Masukan Nama : ")
    val nama = newScanner.nextLine()

    print("Masukan nim : ")
    val nim = newScanner.nextLine()

    //menampilkan isi nama dan nim
    println("NIM Mahasiswa dengan nama $nama adalah $nim")

}