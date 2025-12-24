public class Exercicio1 {
    public static void main(String[] args) {

        int idade = 25;

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        }

        if (idade >= 16) {
            System.out.println("Você pode votar");
        }

        if (idade >= 60) {
            System.out.println("Você é idoso");
        }

        // Desafio extra
        if (idade >= 18) {
            System.out.println("Pode tirar carteira");
            System.out.println("Pode beber");
        }

        if (idade >= 65) {
            System.out.println("Pode se aposentar");
        }
    }
}
