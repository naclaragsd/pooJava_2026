package atvEstudar.relacao.ex3;

public class Guerreiro extends Personagem{
    private double forca;

    public Guerreiro(String nome, double forca){
        super(nome);
        this.forca=forca;
    }

    @Override
    public void atacar(){
        System.out.println(" atacou: "+getNome());
    }
}
