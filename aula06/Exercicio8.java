public class Exercicio8 {

    public static void main(String[] args) {
        System.out.println("Soma: " + somar(10, 5));
        System.out.println("Subtração: " + subtrair(10, 5));
        System.out.println("Multiplicação: " + multiplicar(10, 5));
        System.out.println("Divisão: " + dividir(10, 5));
        System.out.println("Resto: " + resto(10, 3));
    }

    public static int somar(int a, int b) { return a + b; }
    public static int subtrair(int a, int b) { return a - b; }
    public static int multiplicar(int a, int b) { return a * b; }
    public static int dividir(int a, int b) { return b == 0 ? 0 : a / b; }
    public static int resto(int a, int b) { return a % b; }
}
