package L1ForStudy;

// Peça ao usuário 10 números e exiba a soma total.

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] svg){
        Scanner ler = new Scanner(System.in);

        int soma = 0;

        for(int i = 1; i <= 10; i++){
            System.out.printf("Insira o %d número: ",i);
            int num = ler.nextInt();

            soma = soma + num;
        }

        System.out.printf("\nA soma dos números é: %d ",soma);
    }
}
