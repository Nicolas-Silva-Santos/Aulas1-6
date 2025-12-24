public class Exercicio4 {
    public static void main(String[] args) {

        int idade = 25;
        boolean temCarteira = true;
        boolean autorizacaoPais = false;

        boolean podeDirigir = (idade >= 18) && temCarteira;
        System.out.println("Pode dirigir: " + podeDirigir);

        boolean podeViajar = (idade >= 18) || temCarteira;
        System.out.println("Pode viajar: " + podeViajar);

        boolean naoMenor = !(idade < 18);
        System.out.println("Não é menor: " + naoMenor);

        // Desafio extra
        boolean podeEntrarClube = (idade >= 18) || autorizacaoPais;
        System.out.println("Pode entrar no clube: " + podeEntrarClube);
    }
}
