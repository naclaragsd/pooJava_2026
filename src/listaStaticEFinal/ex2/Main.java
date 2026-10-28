package listaStaticEFinal.ex2;

public class Main {
    public static void main(String[] args){
        Produto p1 = new Produto(100.00);
        Produto p2 = new Produto(50.00);

        System.out.printf("produto 1 com imposto: R$%.2f\n",p1.getPrecoComImposto());
        System.out.printf("produto 2 com imposto: R$%.2f\n",p2.getPrecoComImposto());

        /*

        no livro os objetos MUDAM o static; Cada new soma +1 no CONTADOR COMPARTILHADO,
        com isso ele vai crescendo

        no produto, os objetos só USAM o static, a taxa não muda quando um produto é
        criado, cada produto só lê a mesma taxa pra fazer a conta do seu próprio preço

         */
    }
}
