package L2ForStudy;

/* Criar uma classe "Produto" com os atributos nome e preco.
o Definir os atributos como private.
o Criar métodos get e set para acessar e modificar os valores.
o No main, crie um objeto, altere os atributos com os setters e exiba com os getters */

public class Ex6 {
    public static void main(String[] args){

        Produto p1 = new Produto(); // cria o objeto (nome=null, preco=0.0 por padrão)

        p1.setPreco(100); // tenta alterar o preço (passa pela validação)
        p1.setNome("Colar");  // tenta alterar o nome (passa pela validação)

        // usando os getters pra "ler" os valores já alterados
        double precoDoProduto = p1.getPreco();
        String nomeDoProduto = p1.getNome();

        System.out.printf("\n\nProduto: %s \nPreço: %f\n",
                nomeDoProduto,precoDoProduto);
    }
}
