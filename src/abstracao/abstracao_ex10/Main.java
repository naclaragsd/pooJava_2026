package abstracao.abstracao_ex10;

public class Main {
    public static void main(String[] args){
        GeradorDeRelatorio relatorio = new RelatorioHTML();
        relatorio.gerarRelatorio();
    }
}
