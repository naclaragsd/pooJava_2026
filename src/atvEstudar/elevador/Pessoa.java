package atvEstudar.elevador;

public class Pessoa {
    private String nome;
    private Elevador elevadorAtual;
    private double peso;

    public Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }

    public void entrarNoElevador(Elevador elevador){
        this.elevadorAtual = elevador;
    }
}
