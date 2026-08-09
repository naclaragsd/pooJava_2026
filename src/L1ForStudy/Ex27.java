package L1ForStudy;

// Peça ao usuário para digitar uma frase e conte quantas vogais há nela.

import java.util.Locale;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] svg){
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nDigite uma palavra: ");
        String frase = ler.nextLine();
        int cont = 0;

        frase = frase.toLowerCase();

        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);

            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
            cont++;

        }

        System.out.printf("Há %d vogais nessa frase!",cont);
    }
}
