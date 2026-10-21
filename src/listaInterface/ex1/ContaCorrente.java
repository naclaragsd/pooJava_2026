package listaInterface.ex1;

public class ContaCorrente implements Tributavel{
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public double getValorImposto(){
        return saldo * 0.02;
    }
}
