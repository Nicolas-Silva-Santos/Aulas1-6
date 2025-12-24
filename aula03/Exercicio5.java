public class Exercicio5 {
    public static void main(String[] args) {

        int idade = 25;
        String categoria = (idade < 30) ? "Jovem" : "Adulto";
        System.out.println("Categoria: " + categoria);

        int numero = 10;
        String tipo = (numero > 0) ? "Positivo" : (numero < 0 ? "Negativo" : "Zero");
        System.out.println("Tipo: " + tipo);

        double valor = 1000;
        double juros = (valor > 500) ? valor * 0.05 : valor * 0.02;
        System.out.println("Juros: " + juros);
    }
}
