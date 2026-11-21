public class FuncionarioCLT extends Funcionario {
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double bonus = salarioBase * 0.10;
        return salarioBase + bonus;
    }
}
