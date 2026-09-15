package atvHeranca.ex2;

public class Estagiario extends Funcionario{
    private int cargaHoraria;

    public Estagiario(String nome, double salario, int cargaHoraria){
        super(nome,salario);
        this.cargaHoraria= cargaHoraria;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Carga horaria: "+cargaHoraria);
    }
}
