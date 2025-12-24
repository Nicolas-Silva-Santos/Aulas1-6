public class Exercicio4 {

    public static void main(String[] args) {
        System.out.println("Soma: " + somarTres(5, 3, 2));
        System.out.println("Soma: " + somarTres(10, 20, 30));
        System.out.println("Soma: " + somarQuatro(1, 2, 3, 4));
    }

    public static int somarTres(int a, int b, int c) {
        return a + b + c;
    }

    // Desafio extra
    public static int somarQuatro(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
