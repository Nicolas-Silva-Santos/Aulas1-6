public class Exercicio7 {
    public static void main(String[] args) {

        double peso = 75.0;
        double altura = 1.75;

        double imc = peso / (altura * altura);

        System.out.println("=== CALCULADORA DE IMC ===");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + imc);

        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obeso";
        }

        System.out.println("Classificação: " + classificacao);
    }
}
