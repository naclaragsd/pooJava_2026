package atvEstudar.relacao.ex3;

public class Mago extends Personagem{
    private double mana;

    public Mago(String nome, double mana){
        super(nome);
        this.mana=mana;
    }

    @Override
    public void atacar(){
        System.out.println(" atacou: "+getNome());
    }

}
