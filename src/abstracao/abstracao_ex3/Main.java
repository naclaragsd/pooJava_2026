package abstracao.abstracao_ex3;

public class Main {
    public static void main(String[] args){

        Conta c1 = new ContaCorrente("Ana", 100000);
        Conta c2 = new ContaPoupanca("Lucas",1000);

        c1.calcularTaxas();
        c2.calcularTaxas();

        System.out.printf("Corrente de %s: saldo R$%.2f\n", c1.getTitular(), c1.getSaldo());
        System.out.printf("Poupanca de %s: saldo R$%.2f\n", c2.getTitular(), c2.getSaldo());
    }
}
