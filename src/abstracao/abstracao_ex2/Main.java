package abstracao.abstracao_ex2;

public class Main {
    public static void main(String[] args) {

        FormaGeometrica f1 = new Circulo(88);
        FormaGeometrica f2 = new Circulo(44);
        FormaGeometrica f3 = new Quadrado(34);
        FormaGeometrica f4 = new Quadrado(10);

        System.out.printf("\nCirculo 1: area %.2f | perimetro %.2f", f1.calcularArea(), f1.calcularPerimetro());
        System.out.printf("\nCirculo 2: area %.2f | perimetro %.2f", f2.calcularArea(), f2.calcularPerimetro());
        System.out.printf("\nQuadrado 1: area %.2f | perimetro %.2f", f3.calcularArea(), f3.calcularPerimetro());
        System.out.printf("\nQuadrado 2: area %.2f | perimetro %.2f\n", f4.calcularArea(), f4.calcularPerimetro());
    }
}
