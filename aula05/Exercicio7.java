import java.util.HashMap;

public class Exercicio7 {
    public static void main(String[] args) {

        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("João", 25);
        idades.put("Maria", 30);
        idades.put("Pedro", 28);
        idades.put("Ana", 26);

        String maisVelho = "";
        int maiorIdade = 0;

        for (String nome : idades.keySet()) {
            int idade = idades.get(nome);
            System.out.println(nome + ": " + idade);

            if (idade > maiorIdade) {
                maiorIdade = idade;
                maisVelho = nome;
            }
        }

        System.out.println("Pessoa mais velha: " + maisVelho);
    }
}
