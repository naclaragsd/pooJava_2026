package L1ForStudy;

//Leia um número e exiba o dobro, o triplo e a raiz quadrada dele.

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] svg){
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nInsira um número: ");
        int num = ler.nextInt();

        int dobro = num*2;
        int triplo = num*3;
        double raiz = Math.sqrt(num);

        System.out.printf("O dobro de %d é: %d\nO triplo de %d é: %d\nA raiz quadrada de %d é: %f\n",
        num,dobro,
        num,triplo,
        num,raiz);

    }
}
