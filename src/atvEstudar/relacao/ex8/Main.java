package atvEstudar.relacao.ex8;

public class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro("Killjoys");
        Livro livro2= new Livro("nanana");
        Biblioteca biblioteca1 = new Biblioteca("sim");

        biblioteca1.adicionarLivro(livro1);
    }
}
