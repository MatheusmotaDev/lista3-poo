public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
                new PagamentoPix(),
                new PagamentoCartao(),
                new PagamentoBoleto()
        };

        double valorCompra = 250.00;

        for (Pagamento pagamento : pagamentos) {
            pagamento.processarPagamento(valorCompra);
        }
    }
}
