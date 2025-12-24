public class Exercicio3 {

    public static void main(String[] args) {
        System.out.println("Soma: " + somar(5, 3));
        System.out.println("Soma: " + somar(10, 20));

        System.out.println("Subtração: " + subtrair(10, 5));
        System.out.println("Multiplicação: " + multiplicar(4, 3));
        System.out.println("Divisão: " + dividir(10, 2));
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
