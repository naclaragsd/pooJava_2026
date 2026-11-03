package listaTratamentoErros.ex3;

import java.util.Scanner;

public class Main {
    public static void main(){

        Scanner sc = new Scanner(System.in);
        boolean concluido = false;

        while(!concluido){
            try{
                System.out.print("Digite um numero inteiro: ");
                String texto = sc.nextLine();

                int numero = Integer.parseInt(texto);

                System.out.println("Numero convertido: " + numero);
                System.out.println("O dobro dele: " + numero * 2);
                concluido = true;
            } catch(NumberFormatException e){
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
        }
        sc.close();
    }
}
