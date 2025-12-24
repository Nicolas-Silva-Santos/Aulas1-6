public class Exercicio3 {
    public static void main(String[] args) {

        int numero = 7;

        System.out.println("Tabuada do " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        
        for (int n = 1; n <= 10; n++) {
            System.out.println("\nTabuada do " + n);
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}
