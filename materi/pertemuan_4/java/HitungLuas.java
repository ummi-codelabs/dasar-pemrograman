import java.util.Scanner;

public class HitungLuas {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("masukan panjang persegi panjang: ");
        int panjang = newScanner.nextInt();

        System.out.println("masukan lebar persegi panjang: ");
        int lebar = newScanner.nextInt();

        double luas = panjang * lebar;

        System.out.println(luas);
    }
}