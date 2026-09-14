package atvRevisao;

public class ArCondicionadoIoT extends Dispositivo{
    private double temperaturaAlvo;

    public ArCondicionadoIoT (String nome, int consumoWatts, double temperaturaAlvo){
        super(nome, consumoWatts);
        this.temperaturaAlvo = temperaturaAlvo;
    }
}
