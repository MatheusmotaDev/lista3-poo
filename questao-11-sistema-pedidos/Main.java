public class Main {
    public static void main(String[] args) {
        try {
            ProdutoFisico livro = new ProdutoFisico("Livro de Java", 80.00);
            ProdutoDigital curso = new ProdutoDigital("Curso de Java", 120.00);

            Produto[] produtos = {
                    livro,
                    curso
            };

            System.out.println("PRECOS FINAIS");
            for (Produto produto : produtos) {
                System.out.printf(
                        "%s: R$ %.2f%n",
                        produto.getNome(),
                        produto.calcularPrecoFinal()
                );
            }

            double precoComDesconto = curso.aplicarDesconto(10);
            System.out.printf(
                    "%n%s com 10%% de desconto: R$ %.2f%n",
                    curso.getNome(),
                    precoComDesconto
            );
        } catch (PrecoInvalidoException erro) {
            System.out.println("Erro no cadastro: " + erro.getMessage());
        }

        System.out.println();
        System.out.println("CADASTRO COM PRECO INVALIDO");
        try {
            Produto produtoInvalido = new ProdutoFisico("Produto sem preco", 0);
            System.out.println(produtoInvalido.getNome());
        } catch (PrecoInvalidoException erro) {
            System.out.println("Erro no cadastro: " + erro.getMessage());
        }
    }
}
