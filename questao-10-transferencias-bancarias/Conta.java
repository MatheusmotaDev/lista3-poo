public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }

        if (destino == null) {
            throw new IllegalArgumentException("A conta de destino nao pode ser nula.");
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException("A conta de origem nao possui saldo suficiente.");
        }

        saldo = saldo - valor;
        destino.saldo = destino.saldo + valor;

        System.out.printf(
                "Transferencia de R$ %.2f da conta %s para a conta %s realizada.%n",
                valor,
                numero,
                destino.numero
        );
    }

    public void exibirSaldo() {
        System.out.printf("Conta %s | Saldo: R$ %.2f%n", numero, saldo);
    }
}
