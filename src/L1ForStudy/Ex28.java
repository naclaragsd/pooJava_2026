package L1ForStudy;

// Peça ao usuário para digitar uma senha e informe se ela contém pelo menos 8 caracteres.

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] svg) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nDigite uma senha com pelo menos 8 caracteres: ");
        String senha = ler.next();

        if (senha.length() >= 8) {
            System.out.printf("\nA senha contém pelo menos 8 caracteres!");
        } else {
            System.out.printf("\nA senha NÃO contém 8 caracteres!");
        }
    }
}
