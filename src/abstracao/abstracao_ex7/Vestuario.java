package abstracao.abstracao_ex7;

public class Vestuario extends Produto{
    private String tamanho;

    public Vestuario(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Vestuario: %s | Tamanho: %s | R$%.2f%n", getNome(), tamanho, getPreco());
    }

}
