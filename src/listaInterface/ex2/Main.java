package listaInterface.ex2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        DispositivoEletronico l1 = new Lampada();
        DispositivoEletronico l2 = new Lampada();

        DispositivoEletronico a1 = new ArCondicionado();
        DispositivoEletronico a2 = new ArCondicionado();

        l1.ligar();
        l2.desligar();
        System.out.printf("\n");
        a1.desligar();
        a2.ligar();
        System.out.printf("\n");
    }
}
