import java.util.Scanner;

public class HitungVolume {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("masukan panjang: ");
        int panjang = newScanner.nextInt();

        System.out.println("masukan lebar : ");
        int lebar = newScanner.nextInt();

        System.out.println("masukan tinggi: ");
        int tinggi = newScanner.nextInt();

        double volume = panjang * lebar * tinggi;

        System.out.println(volume);
    }
}