package L1ForStudy;

import java.util.Scanner;

//  Leia três números e exiba a média aritmética.

public class Ex4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int soma = 0;

        for(int i=0; i<3; i++){
            System.out.printf("insira o %d número: ",i+1);
                    int num = leitor.nextInt();
                    soma = soma + num;
        }

        System.out.printf("\nA média dos números é: %d",soma/3);

    }
}
