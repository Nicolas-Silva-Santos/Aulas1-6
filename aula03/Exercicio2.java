public class Exercicio2 {
    public static void main(String[] args) {

        int numero = 10;

        if (numero % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }

        if (numero > 0) {
            System.out.println("Número é positivo");
        } else if (numero < 0) {
            System.out.println("Número é negativo");
        } else {
            System.out.println("Número é zero");
        }

        // Desafio extra
        if (numero > 100) {
            System.out.println("Número maior que 100");
        }

        if (numero % 5 == 0) {
            System.out.println("Número é múltiplo de 5");
        }
    }
}
