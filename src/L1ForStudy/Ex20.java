package L1ForStudy;

// Leia um número e exiba todos os números de 0 até esse número.

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] svg){
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nInsira um número: ");
        int num = ler.nextInt();

        for(int i = 0; i <= num; i++){
            System.out.printf("| %d |",i);
        }
    }
}
