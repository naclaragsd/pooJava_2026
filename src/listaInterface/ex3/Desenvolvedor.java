package listaInterface.ex3;

public class Desenvolvedor extends Funcionario implements TrabalhavelRemotamente{
    private String linguagem;

    public Desenvolvedor(String nome, String cpf, double salario, String linguagem) {
        super(nome, cpf, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    @Override
    public double getBonus(){
        return getSalario() * 0.10;
    }

    @Override
    public void trabalharDeCasa(){
        System.out.printf("\nDesenvolvedor trabalhando de casa...");
    }
}
