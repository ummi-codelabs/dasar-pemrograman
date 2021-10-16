package main
import("fmt")

func hello() {
	fmt.Println("Helo world")
}

func cetakNama(nama string, kota string) {
	fmt.Println("Nama saya " , nama, ". Saya tinggal di kota ", kota)
}

func main() {
	hello() // panggil fungsi
	cetakNama("Nadia", "Bandung")
}