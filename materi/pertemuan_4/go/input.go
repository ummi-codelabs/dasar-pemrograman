package main

import(
	"fmt"
	"bufio"
	"os"
)

func main() {
	reader := bufio.NewReader(os.Stdin)

	fmt.Print("masukan nama: ")
	nama, _ := reader.ReadString('\n')
	
	fmt.Print("masukan nim: ")
	nim, _ := reader.ReadString('\n')

	fmt.Println("nim mahasiswa dengan nama " + nama + " adalah " + nim)
}