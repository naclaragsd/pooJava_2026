package listaStaticEFinal.ex1;

public class Livro {
    private String titulo;
    private static int contadorDeLivros = 0;

    public Livro(String titulo) {
        this.titulo = titulo;
        // faz contador ser UM SÓ, da classe, em vez de um por livro
        contadorDeLivros = contadorDeLivros + 1;
    }

    public String getTitulo() {
        return titulo;
    }

    public static int getContadorDeLivros() {
        return contadorDeLivros;
    }
}
