public abstract class Veiculo {
    protected String modelo;
    protected double velocidadeAtual;

    public Veiculo(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public abstract void acelerar();

    public void exibirVelocidade() {
        System.out.printf("%s esta a %.0f km/h.%n", modelo, velocidadeAtual);
    }
}
