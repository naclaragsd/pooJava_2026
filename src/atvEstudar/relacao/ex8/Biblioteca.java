package atvEstudar.relacao.ex8;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;

    public Biblioteca(String nome){
        this.nome=nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro novoLivro){
        this.livros.add(novoLivro);
    }
}
