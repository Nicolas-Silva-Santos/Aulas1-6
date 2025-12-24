import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = 42;
        int tentativas = 0;
        int palpite;

        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");
        System.out.println("Adivinhe um número entre 1 e 100");

        do {
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();    
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Acertou!");
            }

        } while (palpite != numeroSecreto);

        System.out.println("Você acertou em " + tentativas + " tentativas!");
        scanner.close();
    }
}
