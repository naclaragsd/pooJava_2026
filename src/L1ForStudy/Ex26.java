package L1ForStudy;

// Leia uma palavra e exiba ela ao contrário.

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] svg){
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nDigite uma palavra: ");
        String palavra = ler.next();

        String invertida = "";

        for(int i = palavra.length() - 1; i >= 0; i--){
            invertida = invertida + palavra.charAt(i);
        }

        System.out.printf("\nPalavra ao contrário: %s ",invertida);
    }
}
