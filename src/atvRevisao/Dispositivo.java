package atvRevisao;

public class Dispositivo {
    private String nome;
    private int consumoWatts;
    private boolean ligado;
    private Comodo comodo;


    public Dispositivo(String nome, int consumoWatts) {
        this.nome = nome;
        this.consumoWatts = consumoWatts;
    }

    public int getConsumoWatts() {
        return this.consumoWatts;
    }

    public void setComodo(Comodo c){
        this.comodo = c;
    }

}
