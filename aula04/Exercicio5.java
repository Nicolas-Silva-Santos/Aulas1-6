public class Exercicio5 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        
        int soma = 0;
        int numero = 1;

        while (soma <= 100) {
            soma += numero;
            numero++;
        }

        System.out.println("Soma final: " + soma);
    }
}
