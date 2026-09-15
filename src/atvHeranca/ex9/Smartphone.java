package atvHeranca.ex9;

public class Smartphone extends Eletronico{
    private String sistemaOperacional;

    public Smartphone(String marca, String sistemaOperacional){
        super(marca);
        this.sistemaOperacional=sistemaOperacional;
    }
}
