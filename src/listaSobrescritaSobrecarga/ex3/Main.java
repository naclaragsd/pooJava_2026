package listaSobrescritaSobrecarga.ex3;

public class Main {
    public static void main(String[] args) {

        FormaGeometrica forma1 = new Circulo(22);
        FormaGeometrica forma2 = new Circulo(44);
        FormaGeometrica forma3 = new Quadrado(66);
        FormaGeometrica forma4 = new Quadrado(99);

        System.out.printf("Circulo 1: %.2f",forma1.calcularArea());
        System.out.printf("\nCirculo 2: %.2f",forma2.calcularArea());
        System.out.printf("\nQuadrado 1: %.2f",forma3.calcularArea());
        System.out.printf("\nQuadrado 2: %.2f",forma4.calcularArea());
    }
}
