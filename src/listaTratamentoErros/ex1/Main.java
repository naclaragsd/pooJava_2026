package listaTratamentoErros.ex1;

import java.util.InputMismatchException; //oq aparece no erro
import java.util.Scanner; // lê oq é digitado no teclado

public class Main {
    public static void main(String[] args){
        /*
        sc é o leitor do teclado
        concluido é um interruptor que diz se ja deu certo, começa em
        false porque ainda nao fez nada */
        Scanner sc = new Scanner(System.in);
        boolean concluido = false;

        while(!concluido){ //enquanto não cocluiu repete:
            try{ /*

             try é o caminho feliz, pede dois números, divide, mostra o
             resultado, e liga o interruptor (concluido = true)

             se qualquer linha der erro, o java pula o resto do try na hora
             e vai para o catch. Então o concluido = true só é alcançado se
             nada deu errado  */

                System.out.print("Digite o primeiro número: ");
                int a  = sc.nextInt();

                System.out.print("Digite o segundo numero: ");
                int b = sc.nextInt();

                int resultado = a / b;
                System.out.println("Resultado: " + resultado);
                concluido = true;
            } catch (InputMismatchException e){
                System.out.println("Erro: digite apenas numeros inteiros. Tente novamente.");
                sc.nextLine();
            } catch (ArithmeticException e){
                System.out.println("Erro: nao e possivel dividir por zero. Tente novamente.");
            }
        }
        sc.close();
    }
}
