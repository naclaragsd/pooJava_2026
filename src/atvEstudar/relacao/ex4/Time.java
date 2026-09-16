package atvEstudar.relacao.ex4;

import java.util.List;
import java.util.ArrayList;

public class Time {
    private String nomeTime;
    private List<Jogador> jogadores;

    public Time(String nomeTime){
        this.nomeTime=nomeTime;
        this.jogadores = new ArrayList<>();
    }

    public void contratarJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }
}
