public class FuncionarioPJ extends Funcionario {
    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double taxaAdministrativa = salarioBase * 0.05;
        return salarioBase - taxaAdministrativa;
    }
}
