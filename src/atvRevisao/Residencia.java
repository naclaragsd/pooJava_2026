package atvRevisao;

import java.util.ArrayList;

public class Residencia {
    private String endereco;
    private ArrayList<Comodo> comodos;
    private RoteadorCentral roteador;

    public Residencia(String endereco, String ipGateway){
        this.endereco = endereco;
        this.comodos = new ArrayList<Comodo>();
        this.roteador = new RoteadorCentral(ipGateway);
    }

    public void adicionarComodo(Comodo comodo){
        this.comodos.add(comodo);
    }
}
