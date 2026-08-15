package L2ForStudy;

public class Ex5 {
    public static void main(String[] args){
        Pessoa engenheiro = new Pessoa();
        engenheiro.nome = "Lucas";
        engenheiro.idade = 20;

        engenheiro.fazerAniversario();
        System.out.printf("\nNome: %s \nIdade: %d\n",
                engenheiro.nome, engenheiro.idade);
    }
}
