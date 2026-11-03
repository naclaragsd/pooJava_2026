package listaTratamentoErros.ex5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean concluido = false;

        while(!concluido){
            try{
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();

                Pessoa p = new Pessoa(nome,idade);
                System.out.println("Pessoa cadastrada: " + p.getNome() + ", " + p.getIdade() + " anos");
                concluido = true;
            } catch (InputMismatchException e){
                System.out.println("Erro: a idade deve ser um número inteiro.");
                sc.nextLine();
            } catch (IllegalArgumentException e){
                System.out.println("Erro: "+ e.getMessage());
            }
        }
        sc.close();
    }
}
