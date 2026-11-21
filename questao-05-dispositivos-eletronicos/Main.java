public class Main {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        Roteador roteador = new Roteador();
        Computador computador = new Computador();

        System.out.println("TELEVISAO");
        televisao.ligar();
        televisao.desligar();

        System.out.println();
        System.out.println("ROTEADOR");
        roteador.ligar();
        roteador.conectarInternet();
        roteador.desligar();

        System.out.println();
        System.out.println("COMPUTADOR");
        computador.ligar();
        computador.conectarInternet();
        computador.desligar();

        // Uma classe pode implementar varias interfaces porque cada interface
        // representa uma capacidade diferente que a classe pode possuir.
    }
}
