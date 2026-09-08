package simuladorAutomotivo;

public class Tanque {
    private double capacidadeMaxima;
    private double litrosAtuais;

    public Tanque(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void encher(double qtdLitros){
        this.litrosAtuais = this.litrosAtuais + qtdLitros;
    }
}
