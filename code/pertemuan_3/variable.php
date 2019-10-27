<?php 
// Deklarasi variable
//penulisan standar: [tipe data] [nama variable] 

//contoh penulisan variable di bahasa php
$nama_variable = 'ini string';

//variable dengan tipe data string
$nama_mahasiswa = 'Resita';

//variable dengan tipe data integer
$nilai = 100;

//deklarasi variable dengan tipe data boolean
$boolean = true;
$boolean_false = false;

//deklarasi variable dengan tipe data float / double /decimal
$float = 0.05;

//menampilkan output di browser
echo $nama_mahasiswa;
echo "<br>";
echo $nilai;
echo "<br>";
echo $boolean;
echo "<br>";
echo $boolean_false;

//variable dideklarasikan lagi
$nilai = 98;
echo $nilai;

echo "<br>";
echo $float;
echo "<br>";
//cara cek variable
var_dump($nama_mahasiswa);
