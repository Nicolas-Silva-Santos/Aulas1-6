public class Exercicio9 {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int n : numeros) {
            System.out.println(n);
            soma += n;
        }

        System.out.println("Soma do array: " + soma);
    }
}
