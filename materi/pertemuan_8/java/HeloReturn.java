public class HeloReturn {
    public static void main(String[] args) {
        System.out.println(hello());

        double c = tambah(2, 3);

        System.out.println(c);

    }

    static String hello() {
        return "Hello world";
    }

    static double tambah(int a, int b) {
        return a + b;
    }
}