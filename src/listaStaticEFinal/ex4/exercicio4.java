package listaStaticEFinal.ex4;

/*
diferença de memoria entre preço e taxaImposto:

preco - atributo de instancia
cada objeto Produto tem o seu proprio espaço na memoria, com o seu proprio preco,
ele so passa a existir quando o produto é criado com new. Se eu crio 2 produtos,
existe, 2 precos na memoria, se crio 1000 existem 1000

taxaImposto - atributo static
fica guardado uma unica vez, na area da classe Produto, e nao dentro de cada objeto.
Ele existe mesmo antes de qualquer produto ser criado, e todos os produtos usam o
mesmo valor. com 2 ou 1000 produtos, continua existindo uma taxa só

analogia da republica e do monumento:
numa republica, cada morador tem o seu proprio quarto, com as suas coisas.
Isso é o preço: cada produto tem o seu.
Ja p monumento da praça é um só. Ele não pertence a nenhum morador,
já estava la antes de qualquer um chegar, e todos olham para o mesmo monumento.
Isso é a taxaImposto: uma só da classe, compartilhada por todos.
Se a prefeitura muda o monumento, todo mundo vê mudança. Foi o que aconteceu
no ex3: mudei a taxa uma vez e os dois produtos mudaram juntos

 */

public class exercicio4 {
}
