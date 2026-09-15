package atvHeranca.ex1;

public class Moto extends Veiculo {
    private double cilindrada;

    public Moto(String modelo, String marca, double cilindrada){
        super(modelo, marca);
        this.cilindrada=cilindrada;
    }
}
