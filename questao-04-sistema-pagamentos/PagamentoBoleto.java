public class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Boleto de R$ %.2f gerado para pagamento.%n", valor);
    }
}
