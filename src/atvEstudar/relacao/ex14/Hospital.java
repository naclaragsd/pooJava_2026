package atvEstudar.relacao.ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Hospital {
    private String nomeHospital;
    private List<Medico> medicos;

    public Hospital(String nomeHospital){
        this.nomeHospital=nomeHospital;
        this.medicos= new ArrayList<>();
    }

    public void contratarMedico(Medico medico){
        this.medicos.add(Medico);
    }
}
