package L1ForStudy;

//Leia dois números e exiba o maior e o menor entre eles.

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] svg){
        Scanner leitor = new Scanner(System.in);

        System.out.printf("\nDigite  primeiro número: ");
        int n1 = leitor.nextInt();

        System.out.printf("\nDigite o segundo número: ");
        int n2 = leitor.nextInt();

        int maior;
        int menor;

        if(n1>n2){
             maior = n1;
             menor = n2;
        }else{
            maior = n2;
            menor = n1;
        }

        System.out.printf("\nO maior número é: %d\nO menor número é: %d",
                maior,menor);
    }
}
