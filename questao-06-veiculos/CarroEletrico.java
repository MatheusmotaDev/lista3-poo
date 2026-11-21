public class CarroEletrico extends Veiculo implements Eletrico {
    public CarroEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        velocidadeAtual = velocidadeAtual + 15;
        System.out.println("O carro eletrico acelerou 15 km/h.");
    }

    @Override
    public void carregarBateria() {
        System.out.println("A bateria do carro eletrico esta carregando.");
    }
}
