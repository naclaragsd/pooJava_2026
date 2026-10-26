package listaInterface.ex10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Heroi heroi = new Heroi("Ana",100);
        Inimigo inimigo = new Inimigo("nana",80);
        PocaoDeInvisibilidade pocao = new PocaoDeInvisibilidade();

        heroi.atacar();
        inimigo.atacar();

        List<FicarInvisivel> invisiveis = new ArrayList<>();
        invisiveis.add(heroi);
        invisiveis.add(pocao);

        for(FicarInvisivel f : invisiveis){
            f.ficarInvisivel();
        }
    }
}
