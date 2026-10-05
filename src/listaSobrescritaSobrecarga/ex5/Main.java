package listaSobrescritaSobrecarga.ex5;

public class Main {
    public static void main(String[] args){

        Personagem a = new Guerreiro();
        Personagem b = new Mago();

        a.atacar();
        b.atacar();
    }
}
