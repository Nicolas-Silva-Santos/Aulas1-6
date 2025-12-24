import java.util.HashMap;

public class Exercicio10 {
    public static void main(String[] args) {

        HashMap<String, String> contatos = new HashMap<>();

        contatos.put("João", "9999-1111");
        contatos.put("Maria", "9999-2222");
        contatos.put("Pedro", "9999-3333");
        contatos.put("Ana", "9999-4444");

        System.out.println("=== AGENDA ===");
        for (String nome : contatos.keySet()) {
            System.out.println(nome + ": " + contatos.get(nome));
        }

        String busca = "Maria";
        if (contatos.containsKey(busca)) {
            System.out.println("\nTelefone de " + busca + ": " + contatos.get(busca));
        }
    }
}
