package atvHeranca.ex4;

public class ContaPoupanca extends ContaBancaria{
private double rendimento;

public ContaPoupanca(double saldo, String titular, double rendimento){
    super (saldo, titular);
    this.rendimento=rendimento;
}

@Override
public void exibirInformacoes() {
    super.exibirInformacoes();
    System.out.println("rendimento: " + rendimento);
}
}
