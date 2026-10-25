package listaInterface.ex5;

import listaInterface.ex1.ContaCorrente;
import listaInterface.ex1.SeguroDeVida;
import listaInterface.ex1.Tributavel;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Tributavel> bens = new ArrayList<>(); // cria lista vazia
        bens.add(new ContaCorrente(1000.00));
        bens.add(new SeguroDeVida());

        double total = 0;

        /* para cada Tributavel t dentro de bens, o t vai sendo um item
        diferente a cada volta */
        for (Tributavel t : bens){
            total = total + t.getValorImposto();
        }

        System.out.printf("\nimposto total a pagar: R$%.2f\n",total);
    }
}
