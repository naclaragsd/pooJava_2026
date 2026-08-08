package L1ForStudy;

//Peça ao usuário sua idade e informe se ele é menor de idade ou maior de idade.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] svg){
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nInforme sua idade: ");
        int id = ler.nextInt();

        if(id >= 18){
            System.out.printf("Você é maior de idade!\n");
        }else{
            System.out.printf("Você é menor de idade!\n");
        }
    }
}
