public class Exercicio2 {
    public static void main(String[] args) {

        String[] nomes = {"João", "Maria", "Pedro", "Ana"};
        int contadorA = 0;

        for (String nome : nomes) {
            System.out.println(nome);
            if (nome.startsWith("A")) {
                contadorA++;
            }
        }

        System.out.println("Nomes que começam com A: " + contadorA);
    }
}
