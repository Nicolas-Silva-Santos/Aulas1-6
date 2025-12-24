import java.util.ArrayList;

public class Exercicio6 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }

        double media = (double) soma / numeros.size();

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
