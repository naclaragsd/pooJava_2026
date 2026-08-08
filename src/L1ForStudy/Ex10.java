package L1ForStudy;

// Leia um número e exiba se ele é positivo, negativo ou zero.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] svg){
        Scanner leitor = new Scanner(System.in);

        System.out.printf("\nInsira um número: ");
        int num = leitor.nextInt();

        if(num > 0){
            System.out.printf("%d É número positivo\n",num);
        } else if (num == 0) {
            System.out.printf("Zero!\n");
        }else{
            System.out.printf("%d É número negativo\n",num);
        }
    }
}
