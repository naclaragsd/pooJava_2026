package atvEstudar.relacao.ex2;

import java.util.List;
import java.util.ArrayList;

public class Casa {
    private String endereco;
    private List<Comodo> comodos;

    public Casa(String endereco){
        this.endereco=endereco;
        this.comodos=new ArrayList<>();
    }


    public List<Comodo> getComodos(){
        return comodos;
    }

    public void adicionarComodo(String nome){
        Comodo novoComodo = new Comodo(nome);
        this.comodos.add(novoComodo);

        for(Comodo comodo : this.comodos){
            System.out.println("adicionou comodo: "+comodo.getNome());
        }
    }

}
