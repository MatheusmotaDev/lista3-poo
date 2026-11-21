public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.printf("Deposito de R$ %.2f realizado.%n", valor);
        } else {
            System.out.println("O valor do deposito deve ser maior que zero.");
        }
    }

    public abstract void sacar(double valor);

    public void exibirSaldo() {
        System.out.printf("Saldo de %s: R$ %.2f%n", titular, saldo);
    }
}
