package listaSobrescritaSobrecarga.ex6;

public class Main {
    public static void main(String[] args) {

        InstrumentoMusical som1 = new InstrumentoMusical();
        InstrumentoMusical som2 = new Violao();
        InstrumentoMusical som3 = new Bateria();
        InstrumentoMusical som4 = new Piano();

        som1.tocar();
        som2.tocar();
        som3.tocar();
        som4.tocar();

    }
}
