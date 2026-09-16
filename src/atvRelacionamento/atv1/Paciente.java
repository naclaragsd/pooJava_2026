package atvRelacionamento.atv1;

import java.util.List;
import java.util.ArrayList;

public class Paciente {
    private String nome;
    private String cpf;
    private List<Consulta> consultas;

    public Paciente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.consultas = new ArrayList<>();
    }

    public void exibirDados(){
        System.out.println("nome: "+nome+" cpf: "+cpf);
    }
}
