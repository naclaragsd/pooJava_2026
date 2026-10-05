package listaSobrescritaSobrecarga.ex5;

public class Mago extends Personagem{

    @Override
    public void atacar(){
        System.out.printf("Mago lança uma bola de fogo!\n");
    }
}
