package listaSobrescritaSobrecarga.ex10;

public class Gerente  extends Funcionario{

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonus(){
        return super.getBonus() + 1000.00;
    }
}
