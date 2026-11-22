public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome nao pode ser vazio.");
        }

        if (preco <= 0) {
            throw new IllegalArgumentException("O preco deve ser maior que zero.");
        }

        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade nao pode ser negativa.");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDados() {
        System.out.printf(
                "Produto: %s | Preco: R$ %.2f | Quantidade: %d%n",
                nome,
                preco,
                quantidade
        );
    }
}
