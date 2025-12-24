import java.util.HashMap;

public class Exercicio8 {
    public static void main(String[] args) {

        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("Brasil", "Brasília");
        capitais.put("França", "Paris");
        capitais.put("Itália", "Roma");
        capitais.put("Espanha", "Madri");

        String pais = "Brasil";

        if (capitais.containsKey(pais)) {
            System.out.println("Capital de " + pais + ": " + capitais.get(pais));
        }

        // Desafio extra: buscar por capital
        String buscaCapital = "Paris";
        for (String p : capitais.keySet()) {
            if (capitais.get(p).equals(buscaCapital)) {
                System.out.println("País da capital " + buscaCapital + ": " + p);
            }
        }
    }
}
