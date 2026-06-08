package exercicio12;

public class RelatorioPDF implements RelatorioStrategy {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando relatório em PDF: " + conteudo);
    }

    @Override
    public String getFormato() {
        return "PDF";
    }
}
