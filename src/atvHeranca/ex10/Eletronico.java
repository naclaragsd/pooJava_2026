package atvHeranca.ex10;

public class Eletronico extends Produto{
    private String garantia;

    public Eletronico(String nome, double preco, String garantia){
        super(nome,preco);
        this.garantia=garantia;
    }
}
