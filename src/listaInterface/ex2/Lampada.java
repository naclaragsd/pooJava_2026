package listaInterface.ex2;

public class Lampada implements DispositivoEletronico{

    @Override
    public void ligar(){
        System.out.printf("\nLampada ligada!");
    }

    @Override
    public void desligar(){
        System.out.printf("\nLampada desligada!");
    }
}
