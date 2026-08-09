package L1ForStudy;

// Leia números até que o usuário digite 0 e exiba a soma total.

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] svg){
        Scanner ler = new Scanner(System.in);
        int num = 0;
        int soma = 0;

        do{

            System.out.printf("Digite um número: ");
            num = ler.nextInt();
            soma = soma + num;

        }while(num != 0);

        System.out.printf("\nA soma total dos números é: %d",soma);
    }
}
