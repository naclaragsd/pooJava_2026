package listaTratamentoErros.ex2;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        if (preco < 0){
            throw new IllegalArgumentException("O preço não pode ser negativo");
        }

        /* observação: olhe para o new; o ERRO é um OBJETO; A mensagem entre aspas
        vai para o construtor dele:
        new IllegalArgumentException : escreve a mensagem num bilhete
        throw : joga o bilhete
        catch (IllegalArgumentException e) alguém pega o bilhete e da um nome para
        ele que é e
        e.getMessage() : abre o bilhete e lê oq está escrito

        como a verificação está no construtor, um produto com preço negativo
        NEM CHEGA A EXISTIR. o throw interrompe tudo antes de guardar qualquer
        coisa */

        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
