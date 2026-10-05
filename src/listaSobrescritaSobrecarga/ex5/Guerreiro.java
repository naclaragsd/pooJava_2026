package listaSobrescritaSobrecarga.ex5;

public class Guerreiro extends Personagem{

    @Override
    public void atacar(){
        System.out.printf("Guerreiro ataca com a espada!\n");
    }
}
