package L1ForStudy;

//Leia um número e exiba seu antecessor e sucessor.

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] svg){
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num = leitor.nextInt();

        System.out.printf("\nO número antecessor de %d é: %d \nO número sucessor de %d é: %d\n",num,num-1,num,num+1);
    }
}
