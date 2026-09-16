package atvEstudar.relacao.ex1;

public class Main {
    public static void main(String[] args){

        Carro carro1 = new Carro("Mercedes");
        Carro carro2 = new Carro("Fusca");
        Pessoa pessoa1 = new Pessoa("Ana Clara",carro1);
        Pessoa pessoa2 = new Pessoa("Gerard Way",carro2);

        pessoa1.dirigirCarro();
        pessoa2.dirigirCarro();
    }
}
