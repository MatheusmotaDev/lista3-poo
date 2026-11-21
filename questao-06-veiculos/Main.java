public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Carro comum");
        CarroEletrico carroEletrico = new CarroEletrico("Carro eletrico");

        System.out.println("CARRO");
        carro.exibirVelocidade();
        carro.acelerar();
        carro.acelerar();
        carro.exibirVelocidade();

        System.out.println();
        System.out.println("CARRO ELETRICO");
        carroEletrico.exibirVelocidade();
        carroEletrico.carregarBateria();
        carroEletrico.acelerar();
        carroEletrico.acelerar();
        carroEletrico.exibirVelocidade();
    }
}
