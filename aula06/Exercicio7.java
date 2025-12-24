public class Exercicio7 {

    public static void main(String[] args) {
        System.out.println(somar(5, 3));
        System.out.println(somar(5.5, 3.2));
        System.out.println(somar(5, 3, 2));
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }
}
