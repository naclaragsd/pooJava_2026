package atvRelacionamento.atv1;

import java.util.List;
import java.util.ArrayList;

public class Medico {
    private String nome;
    private String crm;
    private List<Consulta> consultas;

    public Medico(String nome, String crm){
        this.nome=nome;
        this.crm=crm;
        this.consultas=new ArrayList<>();
    }

    public void exibirDados(){
        System.out.println("nome: "+nome+" crm: "+crm);
    }
}
