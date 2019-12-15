<?php 

$nilai = 72;
//penulisan switch - case
switch ($nilai) {
    case ($nilai >= 70) && ($nilai < 80):
        echo 'nilai diantara 70 sampai 80';
        break;
    case 80:
        //blok kode ketika $nilai = 80
        echo "nilai mahasiswa adalah 80";
        break;
    case 90:
        echo "nilai mahasiswa adalah 90";
        break;
    
    default:
        echo "nilai bukan 80 dan juga bukan 90";
        break;
}
