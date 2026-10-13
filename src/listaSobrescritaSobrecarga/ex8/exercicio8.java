package listaSobrescritaSobrecarga.ex8;

/*

por que é um mau design:
Cada classe tem um método com um nome distinto para fazer a mesma coisa (calcular imposto),
quem vai usar o codigo, precisa saber o tipo de cada produto, para saber qual método chamar

problema no carrinho de compras:
carrinho guarda todos os itens como Produto. Numa variável do tipo produto, o único metodo
de imposto que aparece é o calcularImpostoProdutoComum(), entao todos pagariam 10%: o
eletronico pagaria menos, e o alimento pagaria mais. Exemplo com produto de R$100,
eletronico de R$ 1000 e alimento de R$50: o total certo seria R$162,50, mas daria R$115,00
para acertar seria preciso testar o tipo de cada produto com if e chamar o metodo certo.
E toda vez que surgisse um tipo novo de produto, esse if teria que ser alterado de novo

solução correta:
sobrescrever calcularImposto para cada classe. Um único método calcularImposto() em produto
(10%), sobrescrito com @Override em Eletronico (15%) e alimento (5%), assim o carrinho
chama sempre produto.calcularImposto() e cada objeto responde com sua propria regra, porque
quem decide qual versão roda e o objeto criado no new. Para um tipo novo de produto, basta
criar a classe e sobrescrever o metodo, sem mexer no carrinho
 */
public class exercicio8 {
}
