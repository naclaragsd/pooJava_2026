package L1ForStudy;

//Leia dois números e exiba a soma deles.

import java.util.Scanner;

public class Ex3 {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
        int a = leitor.nextInt();

        System.out.printf("Digite o segundo número: ");
        int b = leitor.nextInt();

        int soma = somar(a,b);

        System.out.printf("a soma é: %d + %d = %d",a,b,soma);
    }
}
