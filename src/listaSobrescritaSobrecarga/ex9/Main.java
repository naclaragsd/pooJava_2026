package listaSobrescritaSobrecarga.ex9;

/*

----SOBRECARGA----
metodos com o mesmo nome, mas com parametros diferentes (quantidade ou tipo), dentro da mesma
classe. Não precisa de herança e não usa @Override. O Java escolhe qual versão usar pelo que
é passado na chamada, ex: vários construtores na mesma classe, ou os dois somar() da calculadora

-----SOBRESCRITA-----
a classe filha reescreve um metodo que herdou da mãe, com o mesmo nome e os mesmos parametros,
mas com o corpo diferente. Precisa de heranca e usa @Override, que avisa se o nome estiver
errado. O Java usa a versão do objeto criado no new

-----DIFERENÇA-----
sobrecarga: a mesma classe tem varias versões do mesmo nome, escolhidas pelos parametros
sobrescrita: a filha substitui a versão que herdou da mãe, e quem decide qual roda é o
objeto

 */

public class Main {
    public static void main(String[] args){

        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(2,3));
        System.out.println(calc.somar(2,3,4));

        Animal a = new Animal();
        Animal g = new Gato();
        a.emitirSom();
        g.emitirSom();
    }
}
