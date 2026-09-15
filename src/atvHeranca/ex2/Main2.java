package atvHeranca.ex2;

public class Main2 {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Gerard way", 1000, 99999999);
        Estagiario estagiario = new Estagiario("Frank Iero", 100, 10);

        gerente.exibirInformacoes();
        estagiario.exibirInformacoes();
    }
}
