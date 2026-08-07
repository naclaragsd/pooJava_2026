package L1ForStudy;

import java.util.Scanner;

//peça ao usuário para digitar seu nome e exiba uma mensagem de boas-vindas.
public class Ex2 {
    public static void main (String [] args) {
        System.out.printf("Digite seu nome: ");

        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();

        System.out.printf("Boas-vindas, %s !!!",nome);
    }
}
