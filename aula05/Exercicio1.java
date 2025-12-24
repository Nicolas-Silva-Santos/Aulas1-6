public class Exercicio1 {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
            soma += numeros[i];
        }

        System.out.println("Soma: " + soma);
    }
}
