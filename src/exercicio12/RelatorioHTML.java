package exercicio12;

public class RelatorioHTML implements RelatorioStrategy {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando relatório em HTML: " + conteudo);
    }

    @Override
    public String getFormato() {
        return "HTML";
    }
}
