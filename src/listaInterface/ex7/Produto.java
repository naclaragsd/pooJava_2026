package listaInterface.ex7;

public class Produto implements ExportavelCSV{
    private String nome_do_produto;
    private double preco_do_produto;

    public Produto(String nome_do_produto, double preco_do_produto) {
        this.nome_do_produto = nome_do_produto;
        this.preco_do_produto = preco_do_produto;
    }

    public String getNome_do_produto() {
        return nome_do_produto;
    }

    public double getPreco_do_produto() {
        return preco_do_produto;
    }

    @Override
    public String toCSV(){
        return getNome_do_produto() + ";" + getPreco_do_produto();
    }
}
