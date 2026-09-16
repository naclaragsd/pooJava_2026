package atvEstudar.relacao.ex12;

import java.util.List;
import java.util.ArrayList;

public class Orquestra {
    private String nomeOrquestra;
    private List<Musico> musicos;

    public Orquestra(String nomeOrquestra){
        this.nomeOrquestra=nomeOrquestra;
        this.musicos = new ArrayList<>();
    }

    public void convidarMusico(Musico musico){
        this.musicos.add(musico);
    }
}
