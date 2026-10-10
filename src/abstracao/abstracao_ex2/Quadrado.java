package abstracao.abstracao_ex2;

public class Quadrado extends FormaGeometrica{
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }

    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }
}
