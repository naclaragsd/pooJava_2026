package listaInterface.ex4;

/*
animal - classe abstrata (relacao "é um tipo de")
Leao, tigre, pato e morcego são todos animais. Eles formam uma familia e compartilham
caracteristicas, como o atributo peso, A classe abstrata e a ferramenta certa porque
pode guardar atributos comuns(peso), o que a interface não faz. no zoologico não
existe um "animal generico", todo animal é de uma espécie, entao Animal deve ser
abstract, e nao concreta

voar - interface (relacao "é capaz de")
voar nao é oq o animal é, é algo que ele CONSEGUE fazer. Só pato e morcego voam,
e eles nem sao do mesmo grupo: pato é ave, morcego é mamifero, interface é a
ferramenta certa porque representa uma capacidade que só algumas classes tem,
uma classe so pode ter uma mae (extends), mas pode implementar varias interfaces,
pato herda de animal, emtao voar não poderia ser outra classe mae

Como ficaria:
    public abstract class Animal { protected double peso; }
    public interface Voador { void voar(); }
    public class Leao extends Animal { }
    public class Tigre extends Animal { }
    public class Pato extends Animal implements Voador { }
    public class Morcego extends Animal implements Voador { }

 */
public class ex4 {
}
