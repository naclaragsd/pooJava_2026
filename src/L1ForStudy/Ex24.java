package L1ForStudy;

// Peça ao usuário 5 números e exiba a média deles.

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] avg){
        Scanner ler = new Scanner(System.in);

        int soma = 0;

        for(int i = 1; i <= 5; i++){
            System.out.printf("Insira o %d número: ",i);
            int num = ler.nextInt();
            soma = soma + num;
        }

        System.out.printf("\nA média dos números é: %d",soma/5);
    }
}
