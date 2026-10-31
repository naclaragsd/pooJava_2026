package listaStaticEFinal.ex10;

/*
método static em uma classe utilitaria FinanceiroUtil

   justificativa:
calculo de juros compostos depende só dos valores que o método recebe
(principal, taxa e periodos), ele nao precisa guardar nenhuma informacao
em atributos, e com os mesmos valores o resultado é sempre o mesmo.
Se eu criasse uma classe CalculadoraDeJuros para instanciar,
todo objeto seria identico, porque nao teria nada de diferente guardado dentro dele.
Criar um objeto so para fazer uma conta seria desnecessario.

Por isso faz mais sentido uma "caixa de ferramentas", com construtor
privado e o metodo static, chamado direto pela classe:
FinanceiroUtil.calcularJurosCompostos(1000.00, 0.01, 12);
E o mesmo jeito do Math.pow(), do ValidacaoUtil.isEmailValido() e do
ArrayUtil.encontrarMaiorNumero().

Quando valeria a pena instanciar:
Se a calculadora precisasse lembrar de alguma coisa, como uma taxa
diferente para cada cliente ou um historico dos calculos feitos, ai cada
objeto teria o seu proprio estado, e faria sentido usar new.
 */
public class exercicio10 {
}
