public class Exercicio9 {

    public static void main(String[] args) {
        System.out.println(ehMaiorDeIdade(25));
        System.out.println(ehMaiorDeIdade(15));
        System.out.println(ehEmail("joao@email.com"));
        System.out.println(ehEmail("joao"));
        System.out.println(ehSenha("senha123"));
        System.out.println(ehSenha("123"));
    }

    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    public static boolean ehEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean ehSenha(String senha) {
        return senha.length() >= 8;
    }
}
