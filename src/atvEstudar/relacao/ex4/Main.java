package atvEstudar.relacao.ex4;

public class Main {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Frank Iero");
        Jogador jogador2 = new Jogador("Gerard way");
        Time time1 = new Time("São Paulo");

        time1.contratarJogador(jogador1);
        time1.contratarJogador(jogador2);
    }
}
