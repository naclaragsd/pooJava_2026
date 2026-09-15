package atvHeranca.ex10;

public class Roupa extends Produto{
    private int tamanho;

    public Roupa(String nome, double preco, int tamanho){
        super(nome,preco);
        this.tamanho=tamanho;
    }
}
