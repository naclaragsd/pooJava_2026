package L1ForStudy;

//Leia um número e exiba o quadrado e o cubo dele.

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] svg){
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num = leitor.nextInt();

        System.out.printf("\nO quadrado de %d é: %d\nO cubo de %d é: %d\n",
                num,num*num,
                num,num*num*num);
    }
}
