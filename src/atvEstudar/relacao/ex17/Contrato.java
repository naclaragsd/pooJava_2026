package atvEstudar.relacao.ex17;

import java.util.List;
import java.util.ArrayList;

public class Contrato {
    private String numeroContrato;
    private List<Clausula> clausulas;

    public Contrato (String numeroContrato){
        this.numeroContrato=numeroContrato;
        this.clausulas = new ArrayList<>();
    }

    public void adicionarClausula(String texto){
        Clausula novaClausula = new Clausula(texto);
        this.clausulas.add(novaClausula);
    }
}
