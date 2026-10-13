package listaSobrescritaSobrecarga.ex9;

public class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.printf("\nMiau");
    }
}
