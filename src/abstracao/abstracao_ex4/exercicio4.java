package abstracao.abstracao_ex4;

/*

principal pergunta: no meu sistema, faz sentido existir um objeto dessa classe sozinho?
alguém vai criar ou usar um "X generico"?

se a resposta for NÃO, a classe é um CONCEITO: uma ideia geral que só serve para agrupar
o que as coisas reais tem em comum. Ela deve ser abstract.
ex: ninguém abre uma "Conta" genérica no banco, abre uma ContaCorrente ou uma ContaPoupanca.
Ninguem desenha uma "formaGeometrica", desenha um Circulo ou um Quadrado.

se a resposta for SIM, a classe é uma COISA REAL do sistema, que existe por si só, e deve
ser concreta.
ex: contaCorrente, Circulo, Carro

outro sinal: se a classe tem um metodo que ela nao sabe como fazer, porque cada filha faz
de um jeito e nao existe um calculo padrao, ela provavelmente deve ser abstract, com esse
metodo abstract

A resposta depende do contexto d sistema. No sistema de pedagio, um Veiculo generico fazia
sentido, porque pagava a tarifa base. Na locadora, não existe "alugar um veículo generico",
entao ali o veiculo é abstract

 */

public class exercicio4 {
}
