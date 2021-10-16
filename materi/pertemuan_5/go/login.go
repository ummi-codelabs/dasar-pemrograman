package main
import("fmt")

func main() {
	var username string = "admin"
	var password string = "garahasia"

	if(username == "admin" && password == "rahasia") {
		fmt.Println("user berhasil login")
	} else {
		fmt.Println("user gagal login")
	}
}