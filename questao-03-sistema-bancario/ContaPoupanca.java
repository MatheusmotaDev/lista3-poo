public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser maior que zero.");
        } else if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.printf("Saque de R$ %.2f realizado sem taxa.%n", valor);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}
