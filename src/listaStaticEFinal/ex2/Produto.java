package listaStaticEFinal.ex2;

public class Produto {
    private double preco;
    private static double taxaImposto =0.05;

    public Produto(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public double getPrecoComImposto(){
        return this.preco * (1+ taxaImposto);
    }
}
