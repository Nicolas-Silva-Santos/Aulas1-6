public class Exercicio9 {
    public static void main(String[] args) {

        int opcao = 2;

        System.out.println("=== MENU ===");
        System.out.println("1. Adicionar");
        System.out.println("2. Remover");
        System.out.println("3. Listar");
        System.out.println("4. Sair");

        switch (opcao) {
            case 1:
                System.out.println("Adicionando...");
                break;
            case 2:
                System.out.println("Removendo...");
                break;
            case 3:
                System.out.println("Listando...");
                break;
            case 4:
                System.out.println("Encerrando...");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
