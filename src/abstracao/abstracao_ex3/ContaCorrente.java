package abstracao.abstracao_ex3;

public class ContaCorrente extends Conta{

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void calcularTaxas(){
        saldo = saldo - 15.00;
    }
}
