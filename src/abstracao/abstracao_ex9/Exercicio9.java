package abstracao.abstracao_ex9;

/*

um metodo abstract NÃO pode existir dentro de uma classe concreta.

um metodo abstrtact não tem corpo: ele só diz que o metodo existe e que as subclasses
vão implementar. Se a classe fosse concreta, seria possível fazer new dela e chamar
esse metodo. aí o Java não teria nenhum codigo para executar, porque o metodo esta vazio

ex: se Veiculo fosse concreta e tivesse
    public abstract double calcularPedagio();
daria para fazer new Veiculo("Ford", "Ka").calcularPedagio(). Que valor esse metodo
retornaria? nenhum, porque ele não tem corpo

para impedir isso, o Java exige que toda classe com pelo menos um metodo abstract
seja declarada abstract. Assim ninguém consegue criar um objeto dela, e só as subclasses
concretas, que implementam o metodo, podem ser instanciadas. Se tentar colocar um
metodo abstract numa classe concreta, o codigo não compila.

 */

public class Exercicio9 {
}
