package atvHeranca.ex6;

public class PagamentoBoleto extends Pagamento{
    private String codigoBarras;

    public PagamentoBoleto(double valor, String codigoBarras){
        super(valor);
        this.codigoBarras=codigoBarras;
    }
}
