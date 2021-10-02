<?php
$nilai = 90;
$keterangan = "";

switch ($nilai) {
    case 80:
        $keterangan = 'Nilai mahasiswa adalah 80';
        break;
    
    case 90:
        $keterangan = 'Nilai mahasiswa adalah 90';
        break;
    
    default:
        $keterangan = 'Nilai bukan 80 atau 90';
        break;
}

echo $keterangan;
