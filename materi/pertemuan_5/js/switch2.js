let nilai = 90;
let keterangan = '';

switch (nilai) {
    case 80:
        keterangan = 'Nilai mahasiswa adalah 80';
        break;
    case 90:
        keterangan = 'Nilai mahasiswa adalah 90';
        break;

    default:
        keterangan = 'Nilai bukan 80 atau 90';
        break;
}

console.log(keterangan);