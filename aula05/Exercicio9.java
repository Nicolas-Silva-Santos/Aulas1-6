import java.util.ArrayList;

public class Exercicio9 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Pão");
        lista.add("Leite");
        lista.add("Ovos");
        lista.add("Queijo");
        lista.add("Manteiga");

        System.out.println("=== LISTA DE COMPRAS ===");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }

        lista.remove("Queijo");

        System.out.println("\n=== LISTA ATUALIZADA ===");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
    }
}
