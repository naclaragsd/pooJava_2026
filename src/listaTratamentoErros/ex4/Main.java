package listaTratamentoErros.ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try{
            File arquivo = new File("dados.txt");
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }

            leitor.close();
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado. Verifique o nome e o caminho");
        }
    }
}
