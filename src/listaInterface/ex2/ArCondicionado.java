package listaInterface.ex2;

public class ArCondicionado implements DispositivoEletronico{

    @Override
    public void ligar(){
        System.out.printf("\nAr ligado!");
    }

    @Override
    public void desligar(){
        System.out.printf("\nAr desligado!");
    }
}
