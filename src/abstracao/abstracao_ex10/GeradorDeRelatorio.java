package abstracao.abstracao_ex10;

public abstract class GeradorDeRelatorio {

    public final void gerarRelatorio() {
        String cabecalho = construirCabecalho();
        String corpo = construirCorpo();
        String rodape = construirRodape();
        System.out.println(cabecalho + corpo + rodape);
    }

    public abstract String construirCabecalho();

    public abstract String construirCorpo();

    public abstract String construirRodape();
}
