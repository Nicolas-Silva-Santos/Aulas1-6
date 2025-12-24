public class Desafio {

    static double saldo = 1000.0;

    public static void main(String[] args) {
        exibirSaldo();
        depositar(500);
        exibirSaldo();
        sacar(200);
        exibirSaldo();
        sacar(2000);
        exibirSaldo();
    }

    public static void exibirSaldo() {
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
    }

    public static void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado!");
        } else {
            System.out.println("Erro: valor inválido!");
        }
    }

    public static void sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado!");
        } else {
            System.out.println("Erro: saldo insuficiente!");
        }
    }
}
