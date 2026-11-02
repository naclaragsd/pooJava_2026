package listaTratamentoErros.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean concluido = false;

        while (!concluido){
            try{
                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();

                System.out.print("Preço do produto: ");
                double preco = sc.nextDouble();
                sc.nextLine();

                Produto p = new Produto(nome, preco);
                System.out.printf("Produto cadastrado: %s - R$.2f%n",p.getNome(),p.getPreco());
                concluido = true;
            } catch (IllegalArgumentException e){
                System.out.println("Erro: " + e.getLocalizedMessage());
            }
        }
        sc.close();
    }
}
