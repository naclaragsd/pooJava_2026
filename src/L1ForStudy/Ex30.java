package L1ForStudy;

/* Peça ao usuário para digitar uma palavra e verifique
se ela é um palíndromo (exemplo: "arara"). */

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] svg){
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nDigite uma palavra: ");
        String palavra = ler.next();

        StringBuilder sb = new StringBuilder(palavra);
        String invertida = sb.reverse().toString();

        if(palavra.equals(invertida)){
            System.out.printf("\n%s É UM PALINDROMO!\n",palavra);
        }else{
            System.out.printf("\n%s NÃO É UM PALINDROMO!\n",palavra);
        }
    }
}
