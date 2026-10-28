package listaStaticEFinal.ex1;

public class Main {
    public static void main(String[] args){
        Livro l1 = new Livro("Dom Casmurro");
        Livro l2 = new Livro("O cortico");
        Livro l3 = new Livro("Iracema");

        System.out.println("livros criados: " + Livro.getContadorDeLivros());
    }
}
