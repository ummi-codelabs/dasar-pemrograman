// helo();
//cetak_nama("Nadia");
cetak_nama("Nadia", "Bandung");

function nama_fungsi() {
    // block code yang dieksekusi
}

// function tanpa parameter
function helo() {
    console.log("Hello world");
}

function cetak_nama(nama, kota = "Sukabumi") {
    console.log("Nama saya " + nama + ". Saya tinggal di kota " + kota);
}