let nilai = 72;

switch (nilai) {
    case (nilai >= 70) && (nilai < 80):
        console.log("nilai diantara 70 sampai 80")
        break;
    case 80:
        console.log("nilai mahasiswa adalah 80");
        break;
    case 90:
        console.log("nilai mahasiswa adalah 90");
        break
    default:
        console.log("nilai bukan 80 dan juga bukan 90");
        break;
}