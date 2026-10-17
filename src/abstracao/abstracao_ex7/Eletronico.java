package abstracao.abstracao_ex7;

public class Eletronico extends Produto{
    private int garantiaMeses;

    public Eletronico(String nome, double preco, int garantiaMeses) {
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void exibirDetalhes(){
        System.out.printf("Eletronico: %s | Garantia: %d meses | R$%.2f%n", getNome(), garantiaMeses, getPreco());
    }
}
