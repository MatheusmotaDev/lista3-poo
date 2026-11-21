import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro numero inteiro: ");
            int primeiroNumero = scanner.nextInt();

            System.out.print("Digite o segundo numero inteiro: ");
            int segundoNumero = scanner.nextInt();

            int resultado = primeiroNumero / segundoNumero;
            System.out.println("Resultado da divisao: " + resultado);
        } catch (ArithmeticException erro) {
            System.out.println("Nao e possivel dividir por zero.");
        } catch (InputMismatchException erro) {
            System.out.println("Digite apenas numeros inteiros.");
        } finally {
            System.out.println("A operacao foi encerrada.");
            scanner.close();
        }
    }
}
