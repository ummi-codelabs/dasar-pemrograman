package pertemuan_4

import java.util.*

fun main() {

    //membuat objek scanner
    val input = Scanner(System.`in`)

    //mengambil input
    print("Masukan panjang : ")
    val panjang = input.nextInt()

    print("Masukan lebar : ")
    val lebar = input.nextInt()

    print("Masukan tinggi : ")
    val tinggi = input.nextInt()

    val volume = panjang * lebar * tinggi

    //menampilkan isi variabel
    println("Hasil volume : $volume")
}