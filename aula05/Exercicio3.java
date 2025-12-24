public class Exercicio3 {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        numeros[2] = 99;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
            System.out.println(numeros[i]);
        }
    }
}
