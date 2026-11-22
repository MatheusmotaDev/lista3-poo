public abstract class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase) throws PrecoInvalidoException {
        if (precoBase <= 0) {
            throw new PrecoInvalidoException("O preco deve ser maior que zero.");
        }

        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularPrecoFinal();
}
