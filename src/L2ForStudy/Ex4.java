package L2ForStudy;

public class Ex4 {
    public static void main(String[] args){
        Pessoa engenheira = new Pessoa();
        engenheira.nome = "Ana";
        engenheira.idade = 19;

        System.out.printf("\nNome: %s \nIdade: %d\n",
                engenheira.nome, engenheira.idade);
    }
}
