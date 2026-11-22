public class Main {
    public static void main(String[] args) {
        Conta contaOrigem = new Conta("1001", 1000.00);
        Conta contaDestino = new Conta("2002", 500.00);

        System.out.println("SALDOS INICIAIS");
        contaOrigem.exibirSaldo();
        contaDestino.exibirSaldo();

        System.out.println();
        System.out.println("TRANSFERENCIA VALIDA");
        try {
            contaOrigem.transferir(contaDestino, 300.00);
        } catch (SaldoInsuficienteException | IllegalArgumentException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }

        System.out.println();
        System.out.println("TRANSFERENCIA SEM SALDO SUFICIENTE");
        try {
            contaOrigem.transferir(contaDestino, 1000.00);
        } catch (SaldoInsuficienteException | IllegalArgumentException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }

        System.out.println();
        System.out.println("TRANSFERENCIA COM VALOR ZERO");
        try {
            contaOrigem.transferir(contaDestino, 0);
        } catch (SaldoInsuficienteException | IllegalArgumentException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }

        System.out.println();
        System.out.println("TRANSFERENCIA SEM CONTA DE DESTINO");
        try {
            contaOrigem.transferir(null, 100.00);
        } catch (SaldoInsuficienteException | IllegalArgumentException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }

        System.out.println();
        System.out.println("SALDOS FINAIS");
        contaOrigem.exibirSaldo();
        contaDestino.exibirSaldo();
    }
}
