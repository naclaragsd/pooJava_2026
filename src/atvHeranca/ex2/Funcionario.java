package atvHeranca.ex2;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: "+nome+" salario: " + salario);
    }
}
