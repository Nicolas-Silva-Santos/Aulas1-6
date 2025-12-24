public class Exercicio5 {
    public static void main(String[] args) {

        int idade = 25;
        String categoria = (idade >= 18) ? "Adulto" : "Menor";
        System.out.println("Categoria: " + categoria);

        int numero = 10;
        String tipo = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("Tipo: " + tipo);

        double preco = 100;
        double desconto = (preco > 50) ? preco * 0.1 : 0;
        System.out.println("Desconto: " + desconto);

        // Desafio extra
        double nota = 6.5;
        String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println("Resultado: " + resultado);
    }
}
