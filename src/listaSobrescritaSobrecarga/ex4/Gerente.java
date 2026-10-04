package listaSobrescritaSobrecarga.ex4;

public class Gerente extends Colaborador{

    @Override
    public double calcularFerias(){
        return 30 + 7;
    }
}
