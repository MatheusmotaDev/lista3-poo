public class Televisao implements Ligavel {
    @Override
    public void ligar() {
        System.out.println("A televisao foi ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("A televisao foi desligada.");
    }
}
