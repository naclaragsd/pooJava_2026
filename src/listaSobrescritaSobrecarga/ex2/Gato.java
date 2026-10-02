package listaSobrescritaSobrecarga.ex2;

public class Gato extends Animal{

    @Override
    public void emitirSom(){
        System.out.printf("Miau!");
    }
}
