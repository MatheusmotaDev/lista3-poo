public class ProdutoFisico extends Produto {
    public ProdutoFisico(String nome, double precoBase) throws PrecoInvalidoException {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        double taxaEntrega = 15.00;
        return precoBase + taxaEntrega;
    }
}
