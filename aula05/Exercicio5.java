import java.util.ArrayList;

public class Exercicio5 {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Morango");

        frutas.remove(1); 

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
