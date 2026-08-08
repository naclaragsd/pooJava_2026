package L1ForStudy;

// Peça três números e exiba o maior e o menor entre eles.

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] svg){
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nInsira o primeiro número: ");
        int n1 = ler.nextInt();

        System.out.printf("Insira o segundo número: ");
        int n2 = ler.nextInt();

        System.out.printf("Insira o terceito número: ");
        int n3 = ler.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.printf("\n%d é o maior número",n1);
        }else if(n2 > n1 && n2 > n3){
            System.out.printf("\n%d é o maior número",n2);
        }else{
            System.out.printf("\n%d é o maior número",n3);
        }

        if(n1 < n2 && n1 < n3){
            System.out.printf(" %d é o menor número\n",n1);
        }else if(n2 < n1 && n2 < n3){
            System.out.printf(" %d é o menor número\n",n2);
        }else{
            System.out.printf(" %d é o menor número\n",n3);
        }
    }
}
