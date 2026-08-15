package L2ForStudy;

public class Pessoa {
    String nome;
    int idade;

    void fazerAniversario(){
        idade = idade + 1;
        System.out.printf("\n%s fez aniversário! e agora tem %d anos de idade\n",
                nome,idade);
    }

}
