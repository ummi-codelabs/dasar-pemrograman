package main

import("fmt")

func main() {
	var panjang int
	var lebar int
	var tinggi int
	var volume int

    fmt.Print("masukan panjang: ")
    fmt.Scanf("%d", &panjang)

	fmt.Print("masukan lebar: ")
	fmt.Scanf("%d", &lebar)

	fmt.Print("masukan tinggi: ")
	fmt.Scanf("%d", &tinggi)

	volume = panjang * lebar * tinggi

	fmt.Println(volume)

}