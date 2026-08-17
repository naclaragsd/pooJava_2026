package L2ForStudy;

public class Ex10 {
    public static void main(String[] args){

        // Como Aluno não tem construtor vazio, PRECISA passar o nome aqui
        // NÃO se repete o tipo "String" na chamada, só o valor)
        Aluno aluno1 = new Aluno("Ana" );
        System.out.printf("\nNOME: %s",aluno1.getNome());
        aluno1.setNota1(8.2);
        aluno1.setNota2(9.5);

        System.out.printf("\nMÉDIA: %f\n%s",
        aluno1.calcularMedia(),
        aluno1.verificarAprovacao());
    }
}
