public class ProdutoDigital extends Produto implements Descontavel {
    public ProdutoDigital(String nome, double precoBase) throws PrecoInvalidoException {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase;
    }

    @Override
    public double aplicarDesconto(double percentual) {
        double valorDesconto = calcularPrecoFinal() * percentual / 100;
        return calcularPrecoFinal() - valorDesconto;
    }
}
