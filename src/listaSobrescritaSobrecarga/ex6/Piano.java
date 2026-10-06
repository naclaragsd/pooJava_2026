package listaSobrescritaSobrecarga.ex6;

public class Piano extends InstrumentoMusical{

    @Override
    public void tocar(){
        System.out.printf("\nMelodia ao piano...");
    }
}
