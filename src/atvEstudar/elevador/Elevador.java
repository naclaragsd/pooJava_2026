package atvEstudar.elevador;

public class Elevador {
    private String nome;
    private double capacidadeMaximaKg;
    private Pessoa pessoas[];

    private int posicaoLivre; // contador

    public Elevador(String nome, double capacidadeMaximaKg){
        this.nome = nome;
        this.capacidadeMaximaKg = capacidadeMaximaKg;
        this.pessoas = new Pessoa[3];
        this.posicaoLivre = 0;
    }

    public double pesoKgTotal(){
        double soma = 0;

        for(int i = 0; i < this.posicaoLivre; i++){
            soma = soma + pessoas[i].getPeso();
        }
        return soma;
    }

    public boolean entrar(Pessoa p) {
        if (this.posicaoLivre == 3) {
            return false;
        }

        if (this.pesoKgTotal() + p.getPeso() > capacidadeMaximaKg) {
            return false;
        }

        this.pessoas[this.posicaoLivre] = p;
        this.posicaoLivre++;
        p.entrarNoElevador(this);
        return true;
    }
}
