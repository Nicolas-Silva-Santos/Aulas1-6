public class Exercicio2 {

    public static void main(String[] args) {
        saudar("João");
        saudar("Maria");
        saudar("Pedro");

        apresentar("Gustavo", 18);
    }

    public static void saudar(String nome) {
        System.out.println("Olá, " + nome);
    }

    // Desafio extra
    public static void apresentar(String nome, int idade) {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
    }
}
