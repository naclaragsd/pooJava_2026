package L1ForStudy;

// Peça dois números e informe qual é o maior.

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] svg){
        Scanner leitor = new Scanner(System.in);

        System.out.printf("\nInsira o primeiro número: ");
        int n1 = leitor.nextInt();

        System.out.printf("Insira o segundo número: ");
        int n2 =leitor.nextInt();

        if(n1 > n2){
            System.out.printf("\n%d é maior que %d",n1,n2);
        }else{
            System.out.printf("%d é maior que %d",n2,n1);
        }
    }
}
