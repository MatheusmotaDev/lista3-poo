public class Livro {
    private String titulo;
    private int exemplaresDisponiveis;

    public Livro(String titulo, int exemplaresDisponiveis) {
        this.titulo = titulo;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public void emprestar() throws LivroIndisponivelException {
        if (exemplaresDisponiveis == 0) {
            throw new LivroIndisponivelException(
                    "Nao ha exemplares disponiveis do livro " + titulo + "."
            );
        }

        exemplaresDisponiveis = exemplaresDisponiveis - 1;
        System.out.println("Emprestimo realizado: " + titulo);
        System.out.println("Exemplares restantes: " + exemplaresDisponiveis);
    }
}
