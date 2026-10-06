package listaSobrescritaSobrecarga.ex6;

public class Violao extends InstrumentoMusical{

    @Override
            public void tocar() {
        System.out.printf("\nSoando cordas de nylon...");
    }
}
