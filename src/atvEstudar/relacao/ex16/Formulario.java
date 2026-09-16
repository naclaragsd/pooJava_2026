package atvEstudar.relacao.ex16;

import java.util.List;
import java.util.ArrayList;

public class Formulario {
    private String titulo;
    private List<Pergunta> perguntas;

    public Formulario(String titulo){
        this.titulo=titulo;
        this.perguntas= new ArrayList<>();
    }

    public void adicionarPergunta(String enunciado){
        Pergunta novaPergunta = new Pergunta(enunciado);
        this.perguntas.add(novaPergunta);
    }
}
