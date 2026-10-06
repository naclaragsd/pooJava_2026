package listaSobrescritaSobrecarga.ex6;

public class Bateria extends InstrumentoMusical{

    @Override
    public void tocar(){
        System.out.printf("\nRufo de tambores...");
    }
}
