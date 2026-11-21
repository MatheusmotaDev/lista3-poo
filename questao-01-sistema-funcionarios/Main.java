public class Main {
    public static void main(String[] args) {
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Ana", 3000.00);
        FuncionarioPJ funcionarioPJ = new FuncionarioPJ("Carlos", 5000.00);

        System.out.printf(
                "Salario de %s (CLT): R$ %.2f%n",
                funcionarioCLT.getNome(),
                funcionarioCLT.calcularSalario()
        );

        System.out.printf(
                "Salario de %s (PJ): R$ %.2f%n",
                funcionarioPJ.getNome(),
                funcionarioPJ.calcularSalario()
        );
    }
}
