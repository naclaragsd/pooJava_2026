package listaInterface.ex10;

public class Inimigo extends Personagem{

    public Inimigo(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(){
        System.out.println(getNome() + " ataca com as garras!");
    }

}
