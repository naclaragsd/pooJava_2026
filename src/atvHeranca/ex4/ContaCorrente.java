package atvHeranca.ex4;

public class ContaCorrente extends ContaBancaria{
private double limiteCredito;

public ContaCorrente(double saldo, String titular, double limiteCredito){
    super(saldo, titular);
    this.limiteCredito=limiteCredito;
}

@Override
    public void exibirInformacoes(){
    super.exibirInformacoes();
    System.out.println("limite de crédito: "+limiteCredito);
    }
}
