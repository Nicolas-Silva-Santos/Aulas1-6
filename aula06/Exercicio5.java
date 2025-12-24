public class Exercicio5 {

    public static void main(String[] args) {
        System.out.println(ehMaiorDeIdade(25) ? "Maior de idade!" : "Menor de idade!");
        System.out.println(ehMaiorDeIdade(15) ? "Maior de idade!" : "Menor de idade!");
    }

    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }
}
