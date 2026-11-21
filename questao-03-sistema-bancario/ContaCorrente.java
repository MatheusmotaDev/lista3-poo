public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 2.00;
        double valorTotal = valor + taxa;

        if (valor <= 0) {
            System.out.println("O valor do saque deve ser maior que zero.");
        } else if (valorTotal <= saldo) {
            saldo = saldo - valorTotal;
            System.out.printf("Saque de R$ %.2f realizado com taxa de R$ %.2f.%n", valor, taxa);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}
