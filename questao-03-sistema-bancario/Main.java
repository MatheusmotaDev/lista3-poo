public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Ana", 1000.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Carlos", 1000.00);

        System.out.println("CONTA CORRENTE");
        contaCorrente.exibirSaldo();
        contaCorrente.depositar(200.00);
        contaCorrente.sacar(100.00);
        contaCorrente.exibirSaldo();

        System.out.println();
        System.out.println("CONTA POUPANCA");
        contaPoupanca.exibirSaldo();
        contaPoupanca.depositar(200.00);
        contaPoupanca.sacar(100.00);
        contaPoupanca.exibirSaldo();
    }
}
