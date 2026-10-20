package abstracao.abstracao_ex10;

public class RelatorioHTML extends GeradorDeRelatorio{

    @Override
    public String construirCabecalho(){
        return "<header>Relatorio de vendas</header>\n";
    }

    @Override
    public String construirCorpo(){
        return "<main>Total vendido: R$ 1000,00</main\n>";
    }

    @Override
    public String construirRodape(){
        return "<footer>Gerado pelo sistema</footer>";
    }
}
