public class Helo {
    public static void main(String[] args) {
        hello();
        cetakNama("Nadia", "Bandung");

    }

    static void hello() {
        System.out.println("Helo world");
    }

    static void cetakNama(String nama, String kota) {
        System.out.println("Nama saya " + nama + ". Saya tinggal di kota " + kota);
    }
}