public class Exercicio10 {
    public static void main(String[] args) {

        int idade = 25;
        String faixa;

        if (idade < 0) {
            faixa = "Idade inválida";
        } else if (idade < 13) {
            faixa = "Criança";
        } else if (idade < 18) {
            faixa = "Adolescente";
        } else if (idade < 60) {
            faixa = "Adulto";
        } else {
            faixa = "Idoso";
        }

        System.out.println("Idade: " + idade);
        System.out.println("Faixa: " + faixa);

        if (idade >= 18) {
            System.out.println("Pode votar");
            System.out.println("Pode dirigir");
        }

        if (idade >= 60) {
            System.out.println("Pode se aposentar");
        }
    }
}
