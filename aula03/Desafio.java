public class Desafio {
    public static void main(String[] args) {

        double numero1 = 10;
        double numero2 = 3;
        int operacao = 2;

        System.out.println("=== CALCULADORA ===");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        double resultado = 0;
        boolean valido = true;

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: divisão por zero");
                    valido = false;
                }
                break;
            default:
                System.out.println("Operação inválida");
                valido = false;
        }

        if (valido) {
            System.out.println("Resultado: " + resultado);
        }
    }
}
