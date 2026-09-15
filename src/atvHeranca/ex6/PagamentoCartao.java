package atvHeranca.ex6;

public class PagamentoCartao extends Pagamento{
    private int numeroCartao;

    public PagamentoCartao(double valor, int numeroCartao){
        super(valor);
        this.numeroCartao=numeroCartao;
    }
}
