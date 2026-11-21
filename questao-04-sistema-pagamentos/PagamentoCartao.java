public class PagamentoCartao implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado com cartao.%n", valor);
    }
}
