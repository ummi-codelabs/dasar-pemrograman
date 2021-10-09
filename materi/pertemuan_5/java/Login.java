public class Login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "garahasia";

        if (username == "admin" && password == "rahasia") {
            System.out.println("user berhasil login");
        } else {
            System.out.println("user gagal login");
        }
    }
}