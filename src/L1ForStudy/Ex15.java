package L1ForStudy;

/* Peça ao usuário uma senha e verifique se ela é igual a "1234".
Caso contrário, exiba "Acesso negado". */

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] svg){
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nInsira a senha: ");
        String senha = ler.nextLine();

        if(senha.equals("1234")){
            System.out.printf("\nSenha correta!\n");
        }else{
            System.out.printf("\nSenha incorreta!\n");
        }
    }
}
