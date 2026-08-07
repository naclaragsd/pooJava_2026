package L1ForStudy;

import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        System.out.printf("Insira um número: ");

        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();

        System.out.printf("\nNúmero digitado: %d ",numero);
    }
}
