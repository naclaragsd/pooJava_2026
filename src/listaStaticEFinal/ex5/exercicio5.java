package listaStaticEFinal.ex5;

/*
dentro de um metodo static como setTaxaImposto NÃO da para acessar this.preco

o this significa "este objeto", o objeto que chamou o metodo. Mas um metodo
static pertence a classe e é chamado pela classe, sem nenhum objeto
    Produto.setTaxaImposto(0.10);

Nessa chamada não existe nenhum produto envolvido, se o metodo tentasse usar
this.preco, o java nao teria como saber de qual produto é esse preço, pode ter
2 produtos, 1000 produtos, ou nenhum produto criado ainda. Por isso o código
nem compila

o contrario e permitido: um metodo normal (de instancia), como
getPrecoComImposto(), pode usar o atributo static taxaImposto, porque a taxa é uma
só e todos os produtos sabem onde ela está

usando a analogia da republica: o monumento da praça não tem como saber o que tem
no quarto de um morador, porque não pertence a nenhum deles. Mas ualquer morador
consegue olhar para o monumento

 */

public class exercicio5 {
}
