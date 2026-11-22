public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Programacao em Java", 2);

        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            System.out.println("Tentativa de emprestimo " + tentativa);

            try {
                livro.emprestar();
            } catch (LivroIndisponivelException erro) {
                System.out.println("Erro: " + erro.getMessage());
            }

            System.out.println();
        }
    }
}
