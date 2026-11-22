public class Main {
    public static void main(String[] args) {
        try {
            Produto produtoValido = new Produto("Caderno", 25.90, 10);
            produtoValido.exibirDados();
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro no cadastro: " + erro.getMessage());
        }

        try {
            Produto produtoSemNome = new Produto("", 10.00, 5);
            produtoSemNome.exibirDados();
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro no cadastro: " + erro.getMessage());
        }

        try {
            Produto produtoSemPreco = new Produto("Caneta", 0, 20);
            produtoSemPreco.exibirDados();
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro no cadastro: " + erro.getMessage());
        }

        try {
            Produto produtoSemEstoque = new Produto("Mochila", 120.00, -2);
            produtoSemEstoque.exibirDados();
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro no cadastro: " + erro.getMessage());
        }
    }
}
