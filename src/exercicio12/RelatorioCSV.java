package exercicio12;

public class RelatorioCSV implements RelatorioStrategy {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando relatório em CSV: " + conteudo);
    }

    @Override
    public String getFormato() {
        return "CSV";
    }
}
