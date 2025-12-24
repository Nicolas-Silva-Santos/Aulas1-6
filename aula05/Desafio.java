import java.util.HashMap;
import java.util.ArrayList;

public class Desafio {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Double>> alunos = new HashMap<>();

        ArrayList<Double> notasJoao = new ArrayList<>();
        notasJoao.add(7.5);
        notasJoao.add(8.0);
        notasJoao.add(9.0);
        alunos.put("João", notasJoao);

        ArrayList<Double> notasMaria = new ArrayList<>();
        notasMaria.add(8.5);
        notasMaria.add(9.0);
        notasMaria.add(8.5);
        alunos.put("Maria", notasMaria);

        System.out.println("=== SISTEMA DE NOTAS ===");

        String melhorAluno = "";
        double melhorMedia = 0;

        for (String nome : alunos.keySet()) {
            ArrayList<Double> notas = alunos.get(nome);

            double soma = 0;
            double maior = notas.get(0);
            double menor = notas.get(0);

            for (double nota : notas) {
                soma += nota;
                if (nota > maior) maior = nota;
                if (nota < menor) menor = nota;
            }

            double media = soma / notas.size();
            System.out.println(nome + " | Média: " + String.format("%.2f", media)
                    + " | Melhor: " + maior + " | Pior: " + menor);

            if (media > melhorMedia) {
                melhorMedia = media;
                melhorAluno = nome;
            }
        }

        System.out.println("Aluno com melhor média: " + melhorAluno);
    }
}
