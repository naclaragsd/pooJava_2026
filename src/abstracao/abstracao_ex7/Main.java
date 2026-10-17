package abstracao.abstracao_ex7;

/*

justificativa: no sistema, ninguém vende um "produto generico", todo item cadastrado
é um livro, eletronico ou vestuario, produto é um conceito que serve para agrupar o
que todos tem em comu, (nome e preço), e não algo real que existe sozinho. Por isso
não deve ser possível fazer new Produto()

Se fosse possível cadastrar um "produto generico":
ele ficaria sem as informações de cada tipo (livro precisa de autor, roupa de tamanho
eletronico de garantia);
ficaria fora das regras especificas de cada tipo, como calculo de imposto ou frete,
e poderia ser cobrado errado;
nao apareceria nas buscas e filtros por categoria, porque não pertence a nenhuma.
com Produto abstract, o vendedor é obrigado a escolher um tipo real, e o sistema
garante que todo produto segue as regras do seu tipo

 */

public class Main {
    public static void main(String[] args) {

        // Produto p = new Produto("Generico", 10.00); // Nao compila: Produto e abstract

        Produto p1 = new Livro("Dom Casmurro", 39.90, "Machado de Assis");
        Produto p2 = new Eletronico("Fone Bluetooth", 199.90, 12);
        Produto p3 = new Vestuario("Camiseta", 59.90, "M");

        p1.exibirDetalhes();
        p2.exibirDetalhes();
        p3.exibirDetalhes();
    }
}
