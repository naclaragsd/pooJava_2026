package abstracao.abstracao_ex8;

public class IngressoVIP extends Ingresso{
    private double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void imprimirValor(){
        System.out.printf("Ingresso VIP: R$%.2f\n",valor + valorAdicional);
    }
}
