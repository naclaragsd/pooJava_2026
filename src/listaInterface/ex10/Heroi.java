package listaInterface.ex10;

public class Heroi extends Personagem implements FicarInvisivel{

    public Heroi(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(){
        System.out.println(getNome() + " ataca com espada! ");
    }

    @Override
    public void ficarInvisivel(){
        System.out.println(getNome() + " ficou invisivel!");
    }
}
