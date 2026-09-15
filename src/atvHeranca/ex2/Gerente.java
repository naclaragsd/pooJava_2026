package atvHeranca.ex2;

public class Gerente extends Funcionario{
    private int fone;

    public Gerente(String nome, double salario, int fone){
        super(nome, salario);
        this.fone=fone;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("fone: "+fone);
    }
}
