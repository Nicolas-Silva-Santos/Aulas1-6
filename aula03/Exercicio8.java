public class Exercicio8 {
    public static void main(String[] args) {

        String cor = "vermelho";

        switch (cor) {
            case "vermelho":
                System.out.println("Cor quente");
                System.out.println("Paixão e energia");
                break;
            case "azul":
                System.out.println("Cor fria");
                System.out.println("Calma e tranquilidade");
                break;
            case "verde":
                System.out.println("Cor neutra");
                System.out.println("Natureza e esperança");
                break;
            default:
                System.out.println("Cor desconhecida");
        }
    }
}
