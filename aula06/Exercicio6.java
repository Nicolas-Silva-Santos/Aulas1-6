public class Exercicio6 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Soma: " + somar(numeros));
        System.out.println("Média: " + media(numeros));
        System.out.println("Máximo: " + maximo(numeros));
        System.out.println("Mínimo: " + minimo(numeros));
    }

    public static int somar(int[] numeros) {
        int soma = 0;
        for (int n : numeros) soma += n;
        return soma;
    }

    public static double media(int[] numeros) {
        return somar(numeros) / (double) numeros.length;
    }

    public static int maximo(int[] numeros) {
        int max = numeros[0];
        for (int n : numeros) if (n > max) max = n;
        return max;
    }

    public static int minimo(int[] numeros) {
        int min = numeros[0];
        for (int n : numeros) if (n < min) min = n;
        return min;
    }
}
