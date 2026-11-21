public class Roteador implements Ligavel, Conectavel {
    @Override
    public void ligar() {
        System.out.println("O roteador foi ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O roteador foi desligado.");
    }

    @Override
    public void conectarInternet() {
        System.out.println("O roteador conectou-se a internet.");
    }
}
