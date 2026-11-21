public class Computador implements Ligavel, Conectavel {
    @Override
    public void ligar() {
        System.out.println("O computador foi ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O computador foi desligado.");
    }

    @Override
    public void conectarInternet() {
        System.out.println("O computador conectou-se a internet.");
    }
}
