package abstracao.abstracao_ex8;

public class Main {
    public static void main(String[] args){
        Ingresso i1 = new IngressoVIP(150.00,100.00);
        Ingresso i2 = new IngressoPista(150.00);

        i1.imprimirValor();
        i2.imprimirValor();
    }
}
