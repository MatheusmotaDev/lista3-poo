public class Carro extends Veiculo {
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        velocidadeAtual = velocidadeAtual + 10;
        System.out.println("O carro acelerou 10 km/h.");
    }
}
