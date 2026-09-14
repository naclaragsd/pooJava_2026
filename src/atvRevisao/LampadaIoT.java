package atvRevisao;

public class LampadaIoT extends Dispositivo{
    private String corHexadecimal;

    public LampadaIoT(String nome, int consumoWatts, String corHexadecimal){
        super(nome, consumoWatts);
        this.corHexadecimal = corHexadecimal;
    }
}
