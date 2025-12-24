public class Exercicio3 {
    public static void main(String[] args) {

        int nota = 75;

        if (nota >= 90) {
            System.out.println("A - Excelente");
        } else if (nota >= 80) {
            System.out.println("B - Bom");
        } else if (nota >= 70) {
            System.out.println("C - Satisfatório");
        } else if (nota >= 60) {
            System.out.println("D - Insuficiente");
        } else {
            System.out.println("F - Reprovado");
        }

        // Desafio extra
        if (nota >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Recuperação");
        }

        if (nota >= 60 && nota <= 70) {
            System.out.println("Em risco");
        }
    }
}
