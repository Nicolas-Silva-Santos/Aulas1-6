public class Exercicio10 {

    public static void main(String[] args) {
        int[] notas = {7, 8, 9, 10, 6};

        System.out.println("Soma: " + somar(notas));
        System.out.println("Média: " + media(notas));
        System.out.println("Máximo: " + maximo(notas));
        System.out.println("Mínimo: " + minimo(notas));
    }

    public static int somar(int[] n) {
        int s = 0;
        for (int x : n) s += x;
        return s;
    }

    public static double media(int[] n) {
        return somar(n) / (double) n.length;
    }

    public static int maximo(int[] n) {
        int m = n[0];
        for (int x : n) if (x > m) m = x;
        return m;
    }

    public static int minimo(int[] n) {
        int m = n[0];
        for (int x : n) if (x < m) m = x;
        return m;
    }
}
