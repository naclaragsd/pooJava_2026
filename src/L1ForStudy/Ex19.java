package L1ForStudy;

//Peça um número e exiba a tabuada desse número (de 1 a 10).

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] svg){
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nInsira um número: ");
        int num = ler.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("\n%d x %d = %d ",
                    num,
                    i,
                    num * i );
        }
    }
}
