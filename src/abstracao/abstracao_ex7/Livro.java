package abstracao.abstracao_ex7;

public class Livro extends Produto{
    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes(){
        System.out.printf("Livro: %s | Autor: %s | R$%.2f%n", getNome(), autor, getPreco());
    }
}
