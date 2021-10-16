package main
import ("fmt")

func main() {
	fmt.Println(hello())

	var c = tambah(2, 3)

	fmt.Println(c)
}

func hello() string {
	return "Hello world"
}

func tambah(a int, b int) int {
	return a + b
}