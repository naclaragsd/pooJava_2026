package atvHeranca.ex8;

public class Onibus extends Transporte{
    private int num;

    public Onibus(int capacidade, int num){
        super(capacidade);
        this.num=num;
    }

    public void abrirPorta(){
        System.out.println("Porta aberta!");
    }
}
