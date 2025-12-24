public class Exercicio6 {
    public static void main(String[] args) {

        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                System.out.println("Dia útil");
                break;
            case 2:
                System.out.println("Terça-feira");
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Quarta-feira");
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Quinta-feira");
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Sexta-feira");
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Sábado - Fim de semana");
                break;
            case 7:
                System.out.println("Domingo - Fim de semana");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
