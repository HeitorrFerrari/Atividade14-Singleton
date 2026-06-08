package exercicio12;

public class GeradorRelatorio {

    private RelatorioStrategy strategy;

    public GeradorRelatorio(RelatorioStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RelatorioStrategy strategy) {
        this.strategy = strategy;
    }

    public void gerar(String conteudo) {
        strategy.gerar(conteudo);
        LoggerSistema.getInstancia().registrar(
            "Relatório gerado no formato " + strategy.getFormato() + ": " + conteudo
        );
    }
}
