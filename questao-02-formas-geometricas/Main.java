public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = {
                new Circulo(5),
                new Retangulo(4, 6),
                new Triangulo(8, 3)
        };

        for (FormaGeometrica forma : formas) {
            System.out.printf(
                    "Area do %s: %.2f%n",
                    forma.getClass().getSimpleName(),
                    forma.calcularArea()
            );
        }
    }
}
