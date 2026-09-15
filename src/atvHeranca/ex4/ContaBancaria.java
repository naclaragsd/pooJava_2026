package atvHeranca.ex4;

public class ContaBancaria {
    private double saldo;
    private String titular;

public ContaBancaria(double saldo, String titular){
    this.saldo=saldo;
    this.titular=titular;
}

public void exibirInformacoes(){
    System.out.println("saldo: "+saldo+" titular: "+titular);
}
}
