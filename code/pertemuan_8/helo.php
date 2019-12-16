<?php

/**
 *『Dasar pemrograman』 Function
 */

function nama_fungsi() {
    //block code yang dieksekusi
}

//function tanpa parameter
function hello() {
    echo "Hello world";
}

//function dengan parameter
function cetak_nama($nama, $kota = "Sukabumi") {
    echo "Nama saya {$nama}. Saya tinggal di kota {$kota}.";
}



//hello();
cetak_nama("Nadia", "bandung");
//cetak_nama("Nadia");