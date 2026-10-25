package listaInterface.ex6;

public class Main {
    public static void main(String[] args){

        Imprimivel impressao1 = new RelatorioPDF();

        System.out.printf(impressao1.getCabecalho());
        impressao1.imprimir();
    }
}
