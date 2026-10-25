package listaInterface.ex8;

public class Main {
    public static void main(String[] args){
        PortaDeSeguranca porta = new PortaDeSeguranca("12345");

        porta.autenticar("00000");
        porta.autenticar("12345");
    }
}
