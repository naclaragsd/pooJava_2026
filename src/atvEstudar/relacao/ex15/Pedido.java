package atvEstudar.relacao.ex15;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private String numeroPedido;
    private List<ItemPedido> itens;

    public Pedido(String numeroPedido){
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String descricao, double valor){
        ItemPedido novoItem = new ItemPedido(descricao, valor);
        this.itens.add(novoItem);
    }
}
