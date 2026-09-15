package atvHeranca.ex7;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, String discipline){
        super(nome);
        this.disciplina=disciplina;
    }
}
