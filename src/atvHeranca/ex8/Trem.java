package atvHeranca.ex8;

public class Trem extends Transporte{
    private String nome;

    public Trem(int capacidade, String nome){
        super(capacidade);
        this.nome=nome;
    }

    public void acloparVagao(){
        System.out.println("vagão aclopado!");
    }
}
