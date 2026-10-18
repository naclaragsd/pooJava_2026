package abstracao.abstracao_ex8;

public abstract class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    abstract void imprimirValor();
}
