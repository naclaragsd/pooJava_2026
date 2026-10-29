package listaStaticEFinal.ex3;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(100.00);
        Produto p2 = new Produto(50.00);

        System.out.printf("produto 1 com imposto: R$%.2f\n", p1.getPrecoComImposto());
        System.out.printf("produto 2 com imposto: R$%.2f\n", p2.getPrecoComImposto());

        Produto.setTaxaImposto(0.10);

        System.out.printf("produto 1 com imposto: R$%.2f\n", p1.getPrecoComImposto());
        System.out.printf("produto 2 com imposto: R$%.2f\n", p2.getPrecoComImposto());
    }
}
