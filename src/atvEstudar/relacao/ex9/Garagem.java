package atvEstudar.relacao.ex9;

import java.util.List;
import java.util.ArrayList;

public class Garagem {
    private String endereco;
    private List<Carro> carros;

    public Garagem(String endereco){
        this.carros= new ArrayList<>();
        this.endereco=endereco;
    }

    public void guardarCarro(Carro carro){
        this.carros.add(carro);
    }

}
