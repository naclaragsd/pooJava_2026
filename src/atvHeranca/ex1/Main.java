package atvHeranca.ex1;

public class Main {
    public static void main(String[] args){
        Carro meuCarro = new Carro("fusca","mercedes",4);
        meuCarro.exibirInformacoes();

        Moto minhaMoto = new Moto("cb300","honda",9999);
        minhaMoto.exibirInformacoes();
    }
}
