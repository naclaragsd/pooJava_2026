package listaSobrescritaSobrecarga.ex2;

public class Cachorro extends Animal{

    @Override
    public void emitirSom(){
        System.out.printf("Au au!");
    }
}
