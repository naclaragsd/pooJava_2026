package atvEstudar.relacao.ex13;

import java.util.List;
import java.util.ArrayList;

public class Condominio {
    private String endereco;
    private List<Morador> moradores;

    public Condominio(String endereco){
        this.endereco=endereco;
        this.moradores = new ArrayList<>();
    }

    public void registrarMorador(Morador morador){
        this.moradores.add(morador);
    }
}
