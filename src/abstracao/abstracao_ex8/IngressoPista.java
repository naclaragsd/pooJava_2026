package abstracao.abstracao_ex8;

public class IngressoPista extends Ingresso{

    public IngressoPista(double valor) {
        super(valor);
    }

    @Override
    public void imprimirValor(){
        System.out.printf("Ingresso Pista: R$%.2f\n",valor);
    }

}
