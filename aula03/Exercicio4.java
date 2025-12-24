public class Exercicio4 {
    public static void main(String[] args) {

        int idade = 25;
        boolean temCarteira = true;
        boolean temAutorizacao = false;
        boolean temExperiencia = true;

        if (idade >= 18 && temCarteira) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }

        if (idade >= 18 || temAutorizacao) {
            System.out.println("Pode sair");
        }

        if (!(idade < 18)) {
            System.out.println("Não é menor de idade");
        }

        // Desafio extra
        if (idade >= 21 && temCarteira) {
            System.out.println("Pode alugar carro");
        }

        if (idade >= 25 && temCarteira && temExperiencia) {
            System.out.println("Pode dirigir táxi");
        }
    }
}
