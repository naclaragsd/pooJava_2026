package atvHeranca.ex5;

public class Circulo extends Forma{
    private double raio;

    public Circulo(String nome, double raio){
        super(nome);
        this.raio=raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }
}
