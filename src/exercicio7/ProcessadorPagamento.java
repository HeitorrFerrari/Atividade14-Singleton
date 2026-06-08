package exercicio7;

public class ProcessadorPagamento {
    private PagamentoStrategy strategy;

    public ProcessadorPagamento(PagamentoStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PagamentoStrategy strategy) {
        this.strategy = strategy;
    }

    public void executar(double valor) {
        System.out.println("─────────────────────────────");
        strategy.processar(valor);
        System.out.println("─────────────────────────────");
    }
}