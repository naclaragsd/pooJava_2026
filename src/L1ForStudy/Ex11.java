package L1ForStudy;

// Verifique se um número digitado pelo usuário é par ou ímpar.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] svg){
        Scanner leitor = new Scanner(System.in);

        System.out.printf("\nDigite um número: ");
        int num = leitor.nextInt();

        if (num % 2 == 0){
            System.out.printf("%d É par!\n",num);
        }else{
            System.out.printf("%d É impar!\n",num);
        }
    }
}
