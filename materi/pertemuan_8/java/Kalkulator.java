public class Kalkulator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        Aritmatika aritmatika = new Aritmatika();
        
        double hasil = aritmatika.pengurangan(a, b);

        System.out.println(hasil);
    }
}