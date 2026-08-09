package L1ForStudy;

// Leia um nome e verifique se ele começa com a letra "A".

import java.util.Locale;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] svg){
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nDigite um nome: ");
        String nome = ler.next();

        nome = nome.toLowerCase();
        char primeiraLetra = nome.charAt(0);

        if(primeiraLetra == 'a'){
            System.out.printf("\nEsse nome começa com a letra A !");
        }else{
            System.out.printf("\nEsse nome NÃO começa com a letra A !");
        }
    }
}
