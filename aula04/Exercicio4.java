public class Exercicio4 {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("Soma de 1 a 100: " + soma);

    
        int somaPares = 0;
        for (int i = 2; i <= 100; i += 2) {
            somaPares += i;
        }
        System.out.println("Soma dos pares: " + somaPares);
    }
}
