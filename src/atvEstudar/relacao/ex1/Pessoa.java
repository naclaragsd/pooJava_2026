package atvEstudar.relacao.ex1;

public class Pessoa {
    private String nome;
    private Carro carro;

    public Pessoa(String nome, Carro carro){
        this.nome=nome;
        this.carro=carro;
    }

    public void dirigirCarro(){
        System.out.println(this.nome+" está dirigindo car "+this.carro.getModelo());
    }
}
