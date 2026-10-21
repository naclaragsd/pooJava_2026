package listaInterface.ex1;

public class Main {
    public static void main(String[] args){

        Tributavel t1 = new ContaCorrente(1000.00);
        Tributavel t2 = new SeguroDeVida();

        System.out.printf("Imposto da conta corrente: R$%.2f\n",t1.getValorImposto());
        System.out.printf("Imposto do seguro de vida: R$%.2f\n",t2.getValorImposto());
    }
}
